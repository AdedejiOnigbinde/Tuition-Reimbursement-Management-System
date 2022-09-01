import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CapprovalComponent } from './capproval.component';

describe('CapprovalComponent', () => {
  let component: CapprovalComponent;
  let fixture: ComponentFixture<CapprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CapprovalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CapprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
