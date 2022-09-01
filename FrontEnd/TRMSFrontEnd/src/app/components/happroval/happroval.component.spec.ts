import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HapprovalComponent } from './happroval.component';

describe('HapprovalComponent', () => {
  let component: HapprovalComponent;
  let fixture: ComponentFixture<HapprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HapprovalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HapprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
