package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] pets;

    /**
     * «
     *
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;

        if (pets == null) {
            this.pets = new Pet[0];
        } else {
            this.pets = pets;
            setPetOwner();
        }
    }

    private void setPetOwner() {
        for(Pet currentPet : pets) {
            currentPet.setOwner(this);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet[] newPets = Arrays.copyOf(pets, pets.length + 1);
        newPets[newPets.length - 1] = pet;
        pet.setOwner(this);

        this.pets = newPets;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
////        Pet[] newPets = Arrays.copyOf(pets,pets.length-1);
////        int newPetIndex = 0;
////        for (Pet currentPet : pets) {
////            if (!currentPet.equals(pet)) {
////                newPets[newPetIndex] = currentPet;
////                newPetIndex++;
////            }
////        }
//
//        this.pets = newPets;

        for (int i = 0; i < pets.length ; i++) {
            if (pet.equals(pets[i])){
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return this.equals(pet.getOwner());
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet youngest = pets[0];

        for(Pet currentPet : pets){
            if (currentPet.getAge() < youngest.getAge()) {
                youngest = currentPet;
            }
        }

        return youngest.getAge();
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet youngest = pets[0];

        for(Pet currentPet : pets){
            if (currentPet.getAge() > youngest.getAge()) {
                youngest = currentPet;
            }
        }

        return youngest.getAge();    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float total = 0;

        for(Pet currentpet : pets){
             total +=currentpet.getAge();
         }
         return total/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return pets;
    }
}
