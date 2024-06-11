// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyResponseBody extends TeaModel {
    /**
     * <p>The policy to manage passwords.</p>
     */
    @NameInMap("PasswordPolicy")
    public GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyResponseBody self = new GetPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyResponseBody setPasswordPolicy(GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public GetPasswordPolicyResponseBodyPasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public GetPasswordPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordPolicyResponseBodyPasswordPolicy extends TeaModel {
        /**
         * <p>Indicates whether the password has expired.</p>
         * <br>
         * <p>Valid values: `true` and `false`. Default value: `false`.</p>
         * <br>
         * <p>*   If the value of this parameter is `true`, the parent Alibaba Cloud account must reset the password before the RAM user can log on to the console.</p>
         * <p>*   If the value of this parameter is `false`, the RAM user can change the password and then log on to the console.</p>
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
         * <p>The number of previous passwords that the user is prevented from reusing. Default value: 0. The default value indicates that the RAM user is not prevented from reusing previous passwords</p>
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

        public static GetPasswordPolicyResponseBodyPasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordPolicyResponseBodyPasswordPolicy self = new GetPasswordPolicyResponseBodyPasswordPolicy();
            return TeaModel.build(map, self);
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setHardExpiry(Boolean hardExpiry) {
            this.hardExpiry = hardExpiry;
            return this;
        }
        public Boolean getHardExpiry() {
            return this.hardExpiry;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxLoginAttemps(Integer maxLoginAttemps) {
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMinimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

    }

}
