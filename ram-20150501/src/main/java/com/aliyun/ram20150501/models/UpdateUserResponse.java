// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("User")
    @Validation(required = true)
    public UpdateUserResponseUser user;

    public static UpdateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponse self = new UpdateUserResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateUserResponseUser extends TeaModel {
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

        public static UpdateUserResponseUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserResponseUser self = new UpdateUserResponseUser();
            return TeaModel.build(map, self);
        }

    }

}
