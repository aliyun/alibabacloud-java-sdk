// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the user group returned.</p>
     */
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
        /**
         * <p>The description of the user group.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the user group.</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The name of the user group.</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static GetUserGroupResponseBodyUserGroup build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupResponseBodyUserGroup self = new GetUserGroupResponseBodyUserGroup();
            return TeaModel.build(map, self);
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

        public GetUserGroupResponseBodyUserGroup setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
