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

}
