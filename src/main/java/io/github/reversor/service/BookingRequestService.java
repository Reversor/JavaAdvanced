package io.github.reversor.service;

import io.github.reversor.entity.BookingRequest;
import java.time.LocalDate;

public class BookingRequestService {

  public BookingRequest create() {
    return new BookingRequest("", LocalDate.now(), "");
  }

}
