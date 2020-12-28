// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordResetRequired")
    public Boolean passwordResetRequired;

    @NameInMap("MFABindRequired")
    public Boolean MFABindRequired;

    public static UpdateLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileRequest self = new UpdateLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
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

    public UpdateLoginProfileRequest setMFABindRequired(Boolean MFABindRequired) {
        this.MFABindRequired = MFABindRequired;
        return this;
    }
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

}
