package per.BAN.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.net.MalformedURLException;
import java.net.URL;

@AllArgsConstructor
@Data
public class NickName {

    @NonNull
    private String name;

    @NonNull
    private URL meaning;

    public NickName(@NonNull String name, String url) throws MalformedURLException {
        this.name = name;
        this.meaning = new URL(url);
    }
}
