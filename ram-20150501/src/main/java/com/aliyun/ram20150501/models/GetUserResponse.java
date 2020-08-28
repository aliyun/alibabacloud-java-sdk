// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("User")
    @Validation(required = true)
    public GetUserResponseUser user;

    public static GetUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponse self = new GetUserResponse();
        return TeaModel.build(map, self);
    }

    public static class GetUserResponseUser extends TeaModel {
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

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("LastLoginDate")
        @Validation(required = true)
        public String lastLoginDate;

        public static GetUserResponseUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseUser self = new GetUserResponseUser();
            return TeaModel.build(map, self);
        }

    }

}
