package contactdto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString

public class ErrorDto {
    int code;
    String details;
    String message;

}
