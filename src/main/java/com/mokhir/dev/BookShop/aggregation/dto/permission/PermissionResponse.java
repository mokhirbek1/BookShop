package com.mokhir.dev.BookShop.aggregation.dto.permission;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PermissionResponse implements Serializable {
    @NotNull
    @NotBlank
    @JsonProperty("id")
    private Long id;
    @NotNull
    @NotBlank
    @JsonProperty("name")
    private String name;
}
