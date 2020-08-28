// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PasswordPolicy")
    @Validation(required = true)
    public SetPasswordPolicyResponsePasswordPolicy passwordPolicy;

    public static SetPasswordPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyResponse self = new SetPasswordPolicyResponse();
        return TeaModel.build(map, self);
    }

    public static class SetPasswordPolicyResponsePasswordPolicy extends TeaModel {
        @NameInMap("MinimumPasswordLength")
        @Validation(required = true)
        public Integer minimumPasswordLength;

        @NameInMap("RequireLowercaseCharacters")
        @Validation(required = true)
        public Boolean requireLowercaseCharacters;

        @NameInMap("RequireUppercaseCharacters")
        @Validation(required = true)
        public Boolean requireUppercaseCharacters;

        @NameInMap("RequireNumbers")
        @Validation(required = true)
        public Boolean requireNumbers;

        @NameInMap("RequireSymbols")
        @Validation(required = true)
        public Boolean requireSymbols;

        @NameInMap("HardExpiry")
        @Validation(required = true)
        public Boolean hardExpiry;

        @NameInMap("MaxPasswordAge")
        @Validation(required = true)
        public Integer maxPasswordAge;

        @NameInMap("PasswordReusePrevention")
        @Validation(required = true)
        public Integer passwordReusePrevention;

        @NameInMap("MaxLoginAttemps")
        @Validation(required = true)
        public Integer maxLoginAttemps;

        public static SetPasswordPolicyResponsePasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetPasswordPolicyResponsePasswordPolicy self = new SetPasswordPolicyResponsePasswordPolicy();
            return TeaModel.build(map, self);
        }

    }

}
