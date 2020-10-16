// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateUserGroupResponse extends TeaModel {
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
    public UpdateUserGroupResponseData data;

    public static UpdateUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupResponse self = new UpdateUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserGroupResponse setData(UpdateUserGroupResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateUserGroupResponseData getData() {
        return this.data;
    }

    public static class UpdateUserGroupResponseData extends TeaModel {
        @NameInMap("UserGroupId")
        @Validation(required = true)
        public Long userGroupId;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("UserGroupName")
        @Validation(required = true)
        public String userGroupName;

        @NameInMap("UserCount")
        @Validation(required = true)
        public Long userCount;

        @NameInMap("ParentUserGroupId")
        @Validation(required = true)
        public String parentUserGroupId;

        public static UpdateUserGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserGroupResponseData self = new UpdateUserGroupResponseData();
            return TeaModel.build(map, self);
        }

        public UpdateUserGroupResponseData setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        public UpdateUserGroupResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public UpdateUserGroupResponseData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public UpdateUserGroupResponseData setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public UpdateUserGroupResponseData setParentUserGroupId(String parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

    }

}
