// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateUserGroupResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateUserGroupResponseData data;

    public static CreateUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupResponse self = new CreateUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateUserGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserGroupResponse setData(CreateUserGroupResponseData data) {
        this.data = data;
        return this;
    }
    public CreateUserGroupResponseData getData() {
        return this.data;
    }

    public static class CreateUserGroupResponseData extends TeaModel {
        @NameInMap("UserGroupName")
        @Validation(required = true)
        public String userGroupName;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public Long userGroupId;

        public static CreateUserGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateUserGroupResponseData self = new CreateUserGroupResponseData();
            return TeaModel.build(map, self);
        }

        public CreateUserGroupResponseData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public CreateUserGroupResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public CreateUserGroupResponseData setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

    }

}
