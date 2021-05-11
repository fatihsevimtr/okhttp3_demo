
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class Demo {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.xero.com/payroll.xro/1.0/Employees")
                .method("GET", null)
                .addHeader("Xero-Tenant-Id", "dfa1c1fc-8d6e-4c72-831f-25a84c225173")
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjFDQUY4RTY2NzcyRDZEQzAyOEQ2NzI2RkQwMjYxNTgxNTcwRUZDMTkiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJISy1PWm5jdGJjQW8xbkp2MENZVmdWY09fQmsifQ.eyJuYmYiOjE2MjA2OTg3MjIsImV4cCI6MTYyMDcwMDUyMiwiaXNzIjoiaHR0cHM6Ly9pZGVudGl0eS54ZXJvLmNvbSIsImF1ZCI6Imh0dHBzOi8vaWRlbnRpdHkueGVyby5jb20vcmVzb3VyY2VzIiwiY2xpZW50X2lkIjoiREIyQjI3MDI5NTE2NDFFN0FFOTVERjNERTlCMzBEODMiLCJzdWIiOiI0ZDA2YWQ2ZjA4OTk1ZDBmOTk5MTNjNjA3OWYyN2Y3YiIsImF1dGhfdGltZSI6MTYyMDY5Mjk3OCwieGVyb191c2VyaWQiOiIwMGY3YTFjNy1mNjUyLTRjMjUtODQxYi01YmVmZTE2NTdmZTEiLCJnbG9iYWxfc2Vzc2lvbl9pZCI6IjgyYzc1MjBlZGMxYjRlMDJiZWI2ZTJkZDM2MzZiNTA0IiwianRpIjoiZGE4ZmY1YmQ5NjE0MWY3NTkyMGRkZWE1Mzk2Nzc0NDciLCJhdXRoZW50aWNhdGlvbl9ldmVudF9pZCI6ImMxYjljZTY3LTg1NWMtNGMzMS1iNDkzLWMxZjU4ZmE1YmViZiIsInNjb3BlIjpbImVtYWlsIiwicHJvZmlsZSIsIm9wZW5pZCIsImFjY291bnRpbmcucmVwb3J0cy5yZWFkIiwicGF5cm9sbC5lbXBsb3llZXMiLCJwYXlyb2xsLnBheXJ1bnMiLCJwYXlyb2xsLnBheXNsaXAiLCJwYXlyb2xsLnRpbWVzaGVldHMiLCJhY2NvdW50aW5nLnNldHRpbmdzIiwiYWNjb3VudGluZy5hdHRhY2htZW50cyIsImFjY291bnRpbmcudHJhbnNhY3Rpb25zIiwiYWNjb3VudGluZy5qb3VybmFscy5yZWFkIiwiYWNjb3VudGluZy5jb250YWN0cyIsInBheXJvbGwuc2V0dGluZ3MiLCJvZmZsaW5lX2FjY2VzcyJdfQ.mNV4TMbqSSzQaokoHDzFCqL7JtnnwImakec7rWdMG3HEZ8FzVMOycKC8Ymh1QQCk5kO63Hj3ibRvo6yCgrsRYxSE6LnieGCmHAPx_76frohVv8Eoh27ZJIS4mVCrN360uF0haszEhZReEWvcR72UhXiYq0gfc5rUubgI7BnsDPhZjgGnrV9HIfLvC-_VTjnRhFCUqUdZ9NfmfiOgmbSvxwKQTmS6L1UGm_QrQrpo2985aPqR920Rh9PEs3VBRjeF4w6q1lqEEU2gSmrLm0y1zypvsy5UgxJrjpeZdvW7718dFH8xR-xKEhCRU-Vnnv-25Z9i7KmY-CL7Tg1IuDfP7A")
                .addHeader("Cookie", "_gcl_au=1.1.103133555.1619502247; _fbp=fb.1.1619502247462.1827098076; _gid=GA1.2.803200150.1620606160; bm_sz=A214057B134DDF3C430725F6F89186B3~YAAQOwUgF11BgUB5AQAAVkrMWAtL2ESLr0damsIFXosnvAi8/oVykU9YRecH+IfS8plfnVsoNsHrktPM1wuUBIHbG8T5kXhL3A74B5Pd40JB6HlnCTe+Gq3giDY7SJ5rbGNUHm2oEtNqysSqvEKQqThZYWI9LfvFaQS7qIa1ThdR2M1RSY5QBivlbCPrvg==; ak_bmsc=8741FE4B45BB69DBAD3B15C7F85DBFC51720053BD85E0000E5CD9960D5C71C7F~plwlYXWSowJR9MB9A+lhF9SU+RQ7oaVYOm4tD9+2OpZA7lT4078PpdztU0IoPIRHsb44IZvTb1Dznki4U6kPilGgoeTxwrg1GPwxX/suTMo26TX1coFGodMsAdJzZUoR5KD3pNSR6dxcqeg1Pw3Id56WAW3+Uh+EVVXK9mDcdKK1Z1BQHo/KH7IijyDcQfWL6bFXU/Y2MFwlfYB4ylH173Xi2/BdEF5MkzFhwxmekPOhTy3JaNatn0STmDCGnuJMUm; _ga=GA1.2.364028462.1619502247; _ga_Q622B96ZEQ=GS1.1.1620692963.7.1.1620692980.43; _abck=CA161FAC4210AFB926829784C9496121~-1~YAAQXH9PecpmGDZ5AQAAXbfcWAVBERdMchZ7KSfrrurYVW930pSxafMVkmGI+9GKcvsMTZBkqB/OpFCqnScm+DsSNDhjbdQcL29/Pdz19rA9x2KJkjltQX2C+q4aqdyo9H6iusns2iOkqSLxftQdZHvCWhRtwh2eNS1wTPVZ3rlWFb4AAZkllYqMdd/L7sT5PYG2X1wQfCbYCnASHj7uqfZ0kZUnB9C88uUG9yYqIBAUGl+58Q+AJBLtW10Qt+bilgJMhhIfnzolZfESZGqMi9qgvGYX/EI0IxZXI+IgLK1fAmNBtQNPCS+lJdJuxOOaN7XNqzpuHa5RxGTzFfZQK11QzbD7RniCf+pdLieR70zbrbi2a6Kx+NcPummf4ApRvoz3o+wtoUWCeY9DXW2WTQ8fseU=~-1~-1~-1; RT=\"z=1&dm=xero.com&si=i8k873igvm9&ss=kojar7xt&sl=4&tt=0&obo=4&ld=olug&r=038b764fae49c91470c3700a44b6da73&ul=omnt&hd=omny\"; bm_sv=EF4A109DE92817DA568EA00543384069~uGprLK1XMssAa4ErV2kKaMkdSQ8DGUfwLKzn/UDI4hGU6npwwtAPEVTA5Knlm7YbuasSWMZXvf1mpb7sAMZBRMipdY+Ef7dMnFTFmrhd6+DXe5EXtCR8AStAK57y/Awjp0892oM6udo692MEvH0Lcg5j/2kK8YM0SNwDEr4sbus=")
                .build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();

        JsonObject json = JsonParser.parseString(responseBody).getAsJsonObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(json);
        System.out.println(prettyJson);
    }
}
