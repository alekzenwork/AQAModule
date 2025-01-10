package builders;

import pojo.PostPetStoreUser;

public class PetStoreUserGenerate {
    public static PostPetStoreUser setUserData(){
        return PostPetStoreUser
                .builder()
                .firstName("Pavel")
                .lastName("Vinogradov")
                .password("123456")
                .userStatus(1)
                .phone("89999999999")
                .id(123456)
                .email("pavelqw@test.ru")
                .username("aqaUser")
                .build();
    }
}
