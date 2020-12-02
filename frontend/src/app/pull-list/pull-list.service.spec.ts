import { TestBed } from '@angular/core/testing';

import { PullListService } from './pull-list.service';

describe('PullListService', () => {
  let service: PullListService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PullListService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
