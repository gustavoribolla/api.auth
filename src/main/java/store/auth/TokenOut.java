package store.auth;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true)
public record TokenOut(
    String id,
    String token
) implements Serializable {
    private static final long serialVersionUID = 1L;
}
