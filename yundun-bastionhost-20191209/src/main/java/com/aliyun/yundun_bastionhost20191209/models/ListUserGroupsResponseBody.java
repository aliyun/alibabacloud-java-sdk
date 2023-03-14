// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of user groups returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The user groups returned.</p>
     */
    @NameInMap("UserGroups")
    public java.util.List<ListUserGroupsResponseBodyUserGroups> userGroups;

    public static ListUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponseBody self = new ListUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserGroupsResponseBody setUserGroups(java.util.List<ListUserGroupsResponseBodyUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<ListUserGroupsResponseBodyUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class ListUserGroupsResponseBodyUserGroups extends TeaModel {
        /**
         * <p>The description of the user group.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The number of users in the user group.</p>
         */
        @NameInMap("MemberCount")
        public Integer memberCount;

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

        public static ListUserGroupsResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyUserGroups self = new ListUserGroupsResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyUserGroups setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUserGroupsResponseBodyUserGroups setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public ListUserGroupsResponseBodyUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListUserGroupsResponseBodyUserGroups setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
