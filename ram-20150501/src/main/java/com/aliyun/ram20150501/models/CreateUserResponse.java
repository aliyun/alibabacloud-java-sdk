// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("User")
    @Validation(required = true)
    public CreateUserResponseUser user;

    public static CreateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponse self = new CreateUserResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateUserResponseUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("MobilePhone")
        @Validation(required = true)
        public String mobilePhone;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreateUserResponseUser build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseUser self = new CreateUserResponseUser();
            return TeaModel.build(map, self);
        }

    }

}
