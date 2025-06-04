package store.auth;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true)
public record SolveOut(
    private static final long serialVersionUID = 1L;
    String idAccount
) implements Serializable {
    private static final long serialVersionUID = 1L;
}