package io.github.reversor.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingRequest {

  String ad;
  LocalDate date;
  String hotel;

}
