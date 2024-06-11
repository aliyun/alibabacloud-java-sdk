// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether a password will expire.</p>
     * <br>
     * <p>Valid values: `true` and `false`. Default value: `false`. If you leave this parameter unspecified, the default value false is used.</p>
     * <br>
     * <p>*   If you set this parameter to `true`, the Alibaba Cloud account to which the RAM users belong must reset the passwords before the RAM users can log on to the Alibaba Cloud Management Console.</p>
     * <p>*   If you set this parameter to `false`, the RAM users can change the passwords after the passwords expire and then log on to the Alibaba Cloud Management Console.</p>
     */
    @NameInMap("HardExpiry")
    public Boolean hardExpiry;

    /**
     * <p>The maximum number of permitted logon attempts within one hour. The number of logon attempts is reset to zero if a RAM user changes the password.</p>
     */
    @NameInMap("MaxLoginAttemps")
    public Integer maxLoginAttemps;

    /**
     * <p>The number of days for which a password is valid. Default value: 0. The default value indicates that the password never expires.</p>
     */
    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    /**
     * <p>The minimum required number of characters in a password.</p>
     * <br>
     * <p>Valid values: 8 to 32. Default value: 8.</p>
     */
    @NameInMap("MinimumPasswordLength")
    public Integer minimumPasswordLength;

    /**
     * <p>The number of previous passwords that a RAM user is prevented from reusing. Default value: 0. The default value indicates that the RAM user can reuse previous passwords.</p>
     */
    @NameInMap("PasswordReusePrevention")
    public Integer passwordReusePrevention;

    /**
     * <p>Specifies whether a password must contain one or more lowercase letters.</p>
     */
    @NameInMap("RequireLowercaseCharacters")
    public Boolean requireLowercaseCharacters;

    /**
     * <p>Specifies whether a password must contain one or more digits.</p>
     */
    @NameInMap("RequireNumbers")
    public Boolean requireNumbers;

    /**
     * <p>Specifies whether a password must contain one or more special characters.</p>
     */
    @NameInMap("RequireSymbols")
    public Boolean requireSymbols;

    /**
     * <p>Specifies whether a password must contain one or more uppercase letters.</p>
     */
    @NameInMap("RequireUppercaseCharacters")
    public Boolean requireUppercaseCharacters;

    public static SetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyRequest self = new SetPasswordPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyRequest setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
        return this;
    }
    public Boolean getHardExpiry() {
        return this.hardExpiry;
    }

    public SetPasswordPolicyRequest setMaxLoginAttemps(Integer maxLoginAttemps) {
        this.maxLoginAttemps = maxLoginAttemps;
        return this;
    }
    public Integer getMaxLoginAttemps() {
        return this.maxLoginAttemps;
    }

    public SetPasswordPolicyRequest setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }
    public Integer getMaxPasswordAge() {
        return this.maxPasswordAge;
    }

    public SetPasswordPolicyRequest setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }
    public Integer getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }

    public SetPasswordPolicyRequest setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }
    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

    public SetPasswordPolicyRequest setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }
    public Boolean getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    public SetPasswordPolicyRequest setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }
    public Boolean getRequireNumbers() {
        return this.requireNumbers;
    }

    public SetPasswordPolicyRequest setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }
    public Boolean getRequireSymbols() {
        return this.requireSymbols;
    }

    public SetPasswordPolicyRequest setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }
    public Boolean getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

}
