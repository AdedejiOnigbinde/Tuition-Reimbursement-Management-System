import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EformxComponent } from './eformx.component';

describe('EformxComponent', () => {
  let component: EformxComponent;
  let fixture: ComponentFixture<EformxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EformxComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EformxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
