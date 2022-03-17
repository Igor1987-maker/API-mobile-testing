package contactdto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class AuthResponseDto {
    String token;
}
