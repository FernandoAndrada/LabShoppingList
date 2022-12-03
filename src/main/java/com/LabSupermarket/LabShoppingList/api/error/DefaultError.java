package com.LabSupermarket.LabShoppingList.api.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import springfox.documentation.annotations.ApiIgnore;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiIgnore
public class DefaultError {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;

}
