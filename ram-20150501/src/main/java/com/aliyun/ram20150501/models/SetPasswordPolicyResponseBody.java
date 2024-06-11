// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyResponseBody extends TeaModel {
    /**
     * <p>The password policy.</p>
     */
    @NameInMap("PasswordPolicy")
    public SetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyResponseBody self = new SetPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyResponseBody setPasswordPolicy(SetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public SetPasswordPolicyResponseBodyPasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public SetPasswordPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetPasswordPolicyResponseBodyPasswordPolicy extends TeaModel {
        /**
         * <p>Indicates whether a password expires.</p>
         * <br>
         * <p>Valid values: `true` and `false`. Default value: `false`. If the parameter is unspecified, the default value false is returned.</p>
         * <br>
         * <p>*   If this parameter is set to `true`, the Alibaba Cloud account to which the RAM users belong must reset the password before the RAM users can log on to the Alibaba Cloud Management Console.</p>
         * <p>*   If this parameter is set to `false`, the RAM users can change the passwords after the passwords expire and then log on to the Alibaba Cloud Management Console.</p>
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
         */
        @NameInMap("MinimumPasswordLength")
        public Integer minimumPasswordLength;

        /**
         * <p>The number of previous passwords that a RAM user is prevented from reusing. Default value: 0. The default value indicates that the RAM user can reuse previous passwords.</p>
         */
        @NameInMap("PasswordReusePrevention")
        public Integer passwordReusePrevention;

        /**
         * <p>Indicates whether a password must contain one or more lowercase letters.</p>
         */
        @NameInMap("RequireLowercaseCharacters")
        public Boolean requireLowercaseCharacters;

        /**
         * <p>Indicates whether a password must contain one or more digits.</p>
         */
        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        /**
         * <p>Indicates whether a password must contain one or more special characters.</p>
         */
        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

        /**
         * <p>Indicates whether a password must contain one or more uppercase letters.</p>
         */
        @NameInMap("RequireUppercaseCharacters")
        public Boolean requireUppercaseCharacters;

        public static SetPasswordPolicyResponseBodyPasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetPasswordPolicyResponseBodyPasswordPolicy self = new SetPasswordPolicyResponseBodyPasswordPolicy();
            return TeaModel.build(map, self);
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setHardExpiry(Boolean hardExpiry) {
            this.hardExpiry = hardExpiry;
            return this;
        }
        public Boolean getHardExpiry() {
            return this.hardExpiry;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMaxLoginAttemps(Integer maxLoginAttemps) {
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMinimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

    }

}
