import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SapprovalComponent } from './sapproval.component';

describe('SapprovalComponent', () => {
  let component: SapprovalComponent;
  let fixture: ComponentFixture<SapprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SapprovalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SapprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
