package contacttests;

import com.google.gson.Gson;
import contactdto.AuthRequestDto;
import okhttp3.*;
import org.testng.annotations.Test;

public class OkHttpLoginTest {
public static final MediaType JSON = MediaType.get("");


    public void loginTest(){
        Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient();
        AuthRequestDto requestDto = AuthRequestDto.builder()
                .email("")
                .password("")
                .build();

        ResponseBody responseBody = ResponseBody.create(gson.toJson(requestDto),);
        Request request = new Request.Builder()
                .url()
                .post(responseBody)
                .build();

        Response response = client.newCall(request).execute();

    }

}
