package kr.co.shortenurlservice.presentation;

import kr.co.shortenurlservice.domain.ShortenUrl;

public class ShortenUrlInformationDto {
    private String originalKey;
    private String shortenUrlKey;
    private Long redirectCount;

    public ShortenUrlInformationDto(ShortenUrl shortenUrl) {
        this.originalKey = shortenUrl.getOriginalUrl();
        this.shortenUrlKey = shortenUrl.getShortenUrlKey();
        this.redirectCount = shortenUrl.getRedirectCount();
    }

    public String getOriginalKey() {
        return originalKey;
    }

    public String getShortenUrlKey() {
        return shortenUrlKey;
    }

    public Long getRedirectCount() {
        return redirectCount;
    }
}
