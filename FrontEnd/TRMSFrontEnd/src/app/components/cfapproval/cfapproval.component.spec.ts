import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CfapprovalComponent } from './cfapproval.component';

describe('CfapprovalComponent', () => {
  let component: CfapprovalComponent;
  let fixture: ComponentFixture<CfapprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CfapprovalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CfapprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
