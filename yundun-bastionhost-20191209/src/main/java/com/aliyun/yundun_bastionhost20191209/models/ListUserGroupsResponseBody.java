// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("Comment")
        public String comment;

        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("UserGroupId")
        public String userGroupId;

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
