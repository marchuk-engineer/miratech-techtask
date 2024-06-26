package com.miratech.miratechtechtask.dto;

import com.miratech.miratechtechtask.validators.EnumValidator;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record UpdateStatusDto(@NotBlank @EnumValidator(enumClazz = TaskStatus.class) String status) {
}
