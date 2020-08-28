// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    @NameInMap("MinimumPasswordLength")
    public Integer minimumPasswordLength;

    @NameInMap("RequireLowercaseCharacters")
    public Boolean requireLowercaseCharacters;

    @NameInMap("RequireUppercaseCharacters")
    public Boolean requireUppercaseCharacters;

    @NameInMap("RequireNumbers")
    public Boolean requireNumbers;

    @NameInMap("RequireSymbols")
    public Boolean requireSymbols;

    @NameInMap("HardExpiry")
    public Boolean hardExpiry;

    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    @NameInMap("PasswordReusePrevention")
    public Integer passwordReusePrevention;

    @NameInMap("MaxLoginAttemps")
    public Integer maxLoginAttemps;

    public static SetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyRequest self = new SetPasswordPolicyRequest();
        return TeaModel.build(map, self);
    }

}
