package com.simonas_vedeckis.IO;

public class EpisodeException extends RuntimeException{

    public EpisodeException() {
    }

    public EpisodeException(String message) {
        super(message);
    }

    public EpisodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EpisodeException(Throwable cause) {
        super(cause);
    }

    public EpisodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
