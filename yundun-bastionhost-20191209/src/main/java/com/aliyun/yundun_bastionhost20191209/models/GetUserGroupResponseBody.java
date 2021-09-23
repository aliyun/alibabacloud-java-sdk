// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserGroup")
    public GetUserGroupResponseBodyUserGroup userGroup;

    public static GetUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupResponseBody self = new GetUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGroupResponseBody setUserGroup(GetUserGroupResponseBodyUserGroup userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public GetUserGroupResponseBodyUserGroup getUserGroup() {
        return this.userGroup;
    }

    public static class GetUserGroupResponseBodyUserGroup extends TeaModel {
        @NameInMap("UserGroupName")
        public String userGroupName;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static GetUserGroupResponseBodyUserGroup build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupResponseBodyUserGroup self = new GetUserGroupResponseBodyUserGroup();
            return TeaModel.build(map, self);
        }

        public GetUserGroupResponseBodyUserGroup setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public GetUserGroupResponseBodyUserGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetUserGroupResponseBodyUserGroup setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
