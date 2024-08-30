    package com.example.demo.controllers;

    import com.example.demo.classes.Profile;
    import org.springframework.web.bind.annotation.*;

    import java.util.ArrayList;
    import java.util.List;

    @RestController
    @RequestMapping("/profile")
    public class ControllerProfile {

        List<Profile> profiles = new ArrayList<>();

        @GetMapping("/users")
        private List<Profile> getProfiles() {
            return profiles;
        }

        @PostMapping("/users")
        private void createProfile(@RequestBody Profile profile) {
            profiles.add(profile);
        }

        @PutMapping("/users")
        private void updateProfile(@RequestBody Profile profile){
            if(!exists(profile.getId())){
                profiles.add(profile);
            }else{
                update(profile.getId(),profile);
            }
        }

        @DeleteMapping("/users")
        private void deleteProfile(@RequestParam String id){
            if(!exists(id)){
                System.out.println("No existe tal elemento");
            }else{
                delete(id);
            }
        }

        private boolean exists(String id){
            for(Profile profile:profiles){
                if(profile.getId().equals(id)){
                    return true;
                }
            }
            return false;
        }

        private void update(String id,Profile newProfile){
            int i = 0;
            for(Profile profile:profiles){
                if(profile.getId().equals(id)){
                    profiles.set(i,newProfile);
                }
                i++;
            }
        }

        private void delete(String id){
            int i = 0;
            int index = 0;
            for(Profile profile:profiles){
                if(profile.getId().equals(id)){
                    index = i;
                }
                i++;
            }
            profiles.remove(index);
        }

    }
