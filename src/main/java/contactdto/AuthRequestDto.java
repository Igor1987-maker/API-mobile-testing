package contactdto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class AuthRequestDto {
    String email;
    String password;
}
