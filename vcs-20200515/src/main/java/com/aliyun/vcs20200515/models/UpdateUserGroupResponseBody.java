// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateUserGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateUserGroupResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static UpdateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupResponseBody self = new UpdateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserGroupResponseBody setData(UpdateUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateUserGroupResponseBodyData getData() {
        return this.data;
    }

    public UpdateUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class UpdateUserGroupResponseBodyData extends TeaModel {
        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("UserGroupId")
        public Long userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

        @NameInMap("UserCount")
        public Long userCount;

        @NameInMap("ParentUserGroupId")
        public String parentUserGroupId;

        public static UpdateUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserGroupResponseBodyData self = new UpdateUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateUserGroupResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public UpdateUserGroupResponseBodyData setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        public UpdateUserGroupResponseBodyData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public UpdateUserGroupResponseBodyData setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public UpdateUserGroupResponseBodyData setParentUserGroupId(String parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

    }

}
