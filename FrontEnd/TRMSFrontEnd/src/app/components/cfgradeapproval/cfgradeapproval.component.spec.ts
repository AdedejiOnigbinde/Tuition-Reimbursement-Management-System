import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CfgradeapprovalComponent } from './cfgradeapproval.component';

describe('CfgradeapprovalComponent', () => {
  let component: CfgradeapprovalComponent;
  let fixture: ComponentFixture<CfgradeapprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CfgradeapprovalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CfgradeapprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
