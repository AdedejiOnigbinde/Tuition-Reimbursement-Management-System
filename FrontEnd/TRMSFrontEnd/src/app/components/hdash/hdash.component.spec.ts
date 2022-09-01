import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HdashComponent } from './hdash.component';

describe('HdashComponent', () => {
  let component: HdashComponent;
  let fixture: ComponentFixture<HdashComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HdashComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
