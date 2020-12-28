// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateLoginProfileRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordResetRequired")
    public Boolean passwordResetRequired;

    @NameInMap("MFABindRequired")
    public Boolean MFABindRequired;

    public static CreateLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileRequest self = new CreateLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateLoginProfileRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateLoginProfileRequest setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }
    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    public CreateLoginProfileRequest setMFABindRequired(Boolean MFABindRequired) {
        this.MFABindRequired = MFABindRequired;
        return this;
    }
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

}
