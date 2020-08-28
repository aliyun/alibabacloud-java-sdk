// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoginProfile")
    @Validation(required = true)
    public GetLoginProfileResponseLoginProfile loginProfile;

    public static GetLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileResponse self = new GetLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public static class GetLoginProfileResponseLoginProfile extends TeaModel {
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

        public static GetLoginProfileResponseLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            GetLoginProfileResponseLoginProfile self = new GetLoginProfileResponseLoginProfile();
            return TeaModel.build(map, self);
        }

    }

}
