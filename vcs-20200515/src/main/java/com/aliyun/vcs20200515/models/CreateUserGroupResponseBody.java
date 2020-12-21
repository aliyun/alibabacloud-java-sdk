// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateUserGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateUserGroupResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static CreateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupResponseBody self = new CreateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserGroupResponseBody setData(CreateUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateUserGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateUserGroupResponseBodyData extends TeaModel {
        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("UserGroupId")
        public Long userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

        public static CreateUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateUserGroupResponseBodyData self = new CreateUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateUserGroupResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public CreateUserGroupResponseBodyData setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        public CreateUserGroupResponseBodyData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
