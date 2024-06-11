// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileRequest extends TeaModel {
    /**
     * <p>Specifies whether an MFA device must be attached to the RAM user upon logon.</p>
     */
    @NameInMap("MFABindRequired")
    public Boolean MFABindRequired;

    /**
     * <p>The logon password of the RAM user. The password must meet the password strength requirements.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether the RAM user must change the password upon logon.</p>
     */
    @NameInMap("PasswordResetRequired")
    public Boolean passwordResetRequired;

    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileRequest self = new UpdateLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileRequest setMFABindRequired(Boolean MFABindRequired) {
        this.MFABindRequired = MFABindRequired;
        return this;
    }
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

    public UpdateLoginProfileRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateLoginProfileRequest setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }
    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    public UpdateLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
