import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CdashComponent } from './cdash.component';

describe('CdashComponent', () => {
  let component: CdashComponent;
  let fixture: ComponentFixture<CdashComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CdashComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
