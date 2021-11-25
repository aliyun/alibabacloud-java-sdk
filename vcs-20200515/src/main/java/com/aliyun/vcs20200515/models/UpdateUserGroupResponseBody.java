// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateUserGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateUserGroupResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupResponseBody self = new UpdateUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserGroupResponseBody setData(UpdateUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateUserGroupResponseBodyData getData() {
        return this.data;
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

    public static class UpdateUserGroupResponseBodyData extends TeaModel {
        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("ParentUserGroupId")
        public String parentUserGroupId;

        @NameInMap("UserCount")
        public Long userCount;

        @NameInMap("UserGroupId")
        public Long userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

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

        public UpdateUserGroupResponseBodyData setParentUserGroupId(String parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        public UpdateUserGroupResponseBodyData setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
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

    }

}
