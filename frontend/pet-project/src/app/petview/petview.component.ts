import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { PetsService } from '../pets.service';
import { Pets } from './../pets';

@Component({
  selector: 'app-petview',
  templateUrl: './petview.component.html',
  styleUrls: ['./petview.component.css']
})

export class PetsComponent implements OnInit {

  pets: Pets[] = [];
  pet: Pets = {};

  readonly addPet: FormGroup = new FormGroup({
    'id': new FormControl(''),
    'animal': new FormControl(''),
    'breed': new FormControl(''),
    'characteristics': new FormControl(''),
    'issues': new FormControl(''),
    'coats': new FormControl(''),
    'size': new FormControl(''),
    'long_fur': new FormControl(''),
    'loud': new FormControl(''),
    'introverted': new FormControl(''),
    'intelligent': new FormControl(''),
  });

  readonly editPet: FormGroup = new FormGroup({
    'id': new FormControl(''),
    'animal': new FormControl(''),
    'breed': new FormControl(''),
    'characteristics': new FormControl(''),
    'issues': new FormControl(''),
    'coats': new FormControl(''),
    'size': new FormControl(''),
    'long_fur': new FormControl(''),
    'loud': new FormControl(''),
    'introverted': new FormControl(''),
    'intelligent': new FormControl(''),
  });

  constructor(public petsService: PetsService) {}

  ngOnInit(): void {
    this.getPets();
  }

  getPets() {
    this.petsService.getPets()
    .subscribe({
      next: (pets) => {
        this.pets = pets;
      }
    })
  }

  getPetById(id: String) {
    this.petsService.getPetById(id)
    .subscribe({
      next: (pet) => {
        this.pet.id = pet.id;
        (this.editPet.get('animal') as FormControl).setValue(pet.animal);
        (this.editPet.get('breed') as FormControl).setValue(pet.breed);
        (this.editPet.get('characteristics') as FormControl).setValue(pet.characteristics);
        (this.editPet.get('issues') as FormControl).setValue(pet.issues);
        (this.editPet.get('coats') as FormControl).setValue(pet.coats);
        (this.editPet.get('size') as FormControl).setValue(pet.size);
        (this.editPet.get('long_fur') as FormControl).setValue(pet.long_fur);
        (this.editPet.get('loud') as FormControl).setValue(pet.loud);
        (this.editPet.get('introverted') as FormControl).setValue(pet.introverted);
        (this.editPet.get('intelligent') as FormControl).setValue(pet.intelligent);
      }
    })
  }

  clickAddPet(data: any) {
    console.log(data);
    if (data.long_fur == "") {
        data.long_fur = false;
    }
    if (data.loud== "") {
        data.loud = false;
    }
    if (data.introverted== "") {
        data.introverted = false;
    }
    if (data.intelligent== "") {
        data.intelligent = false;
    }
    
    this.petsService.createPet(data)
    .subscribe({
      next: (res) => {
        this.getPets();
      }
    })
  }

  clickEditPet(data: any) {
    data.id = this.pet.id;
    this.petsService.editPet(data)
    .subscribe({
      next: (res) => {
        this.getPets();
      }
    })
  }

  deletePet(id: String) {
    this.petsService.deletePet(id)
    .subscribe({
      next: (res) => {
        this.getPets();
      }
    })
  }
}
