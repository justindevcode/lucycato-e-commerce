package org.lucycato.userservice.application.port.in.command;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.lucycato.common.SelfValidating;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppVersionCheckCommand extends SelfValidating<AppVersionCheckCommand> {
    @NotBlank
    private String appVersion;

    public AppVersionCheckCommand(String appVersion) {
        this.appVersion = appVersion;

        this.validateSelf();
    }
}
