// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static CreateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupResponseBody self = new CreateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserGroupResponseBody setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
