// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoginProfile")
    @Validation(required = true)
    public CreateLoginProfileResponseLoginProfile loginProfile;

    public static CreateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponse self = new CreateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateLoginProfileResponseLoginProfile extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("PasswordResetRequired")
        @Validation(required = true)
        public Boolean passwordResetRequired;

        @NameInMap("MFABindRequired")
        @Validation(required = true)
        public Boolean MFABindRequired;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreateLoginProfileResponseLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateLoginProfileResponseLoginProfile self = new CreateLoginProfileResponseLoginProfile();
            return TeaModel.build(map, self);
        }

    }

}
