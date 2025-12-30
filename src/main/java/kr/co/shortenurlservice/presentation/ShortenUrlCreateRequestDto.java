package kr.co.shortenurlservice.presentation;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

public class ShortenUrlCreateRequestDto {

    @NotNull
    @URL(regexp = "[(https(s)?):\\/\\/(www\\.)?a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)")
    private String originalUrl;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public ShortenUrlCreateRequestDto(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortenUrlKey() {
        return this.originalUrl;
    }
}
