import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EformvComponent } from './eformv.component';

describe('EformvComponent', () => {
  let component: EformvComponent;
  let fixture: ComponentFixture<EformvComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EformvComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EformvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
