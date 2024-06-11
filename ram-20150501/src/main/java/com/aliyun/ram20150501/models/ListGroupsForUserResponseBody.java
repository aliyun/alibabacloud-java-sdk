// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListGroupsForUserResponseBody extends TeaModel {
    /**
     * <p>The list of the RAM user groups.</p>
     */
    @NameInMap("Groups")
    public ListGroupsForUserResponseBodyGroups groups;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGroupsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserResponseBody self = new ListGroupsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserResponseBody setGroups(ListGroupsForUserResponseBodyGroups groups) {
        this.groups = groups;
        return this;
    }
    public ListGroupsForUserResponseBodyGroups getGroups() {
        return this.groups;
    }

    public ListGroupsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGroupsForUserResponseBodyGroupsGroup extends TeaModel {
        /**
         * <p>The description of the RAM user group.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The ID of the RAM user group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the RAM user group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the RAM user joined the RAM user group.</p>
         */
        @NameInMap("JoinDate")
        public String joinDate;

        public static ListGroupsForUserResponseBodyGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseBodyGroupsGroup self = new ListGroupsForUserResponseBodyGroupsGroup();
            return TeaModel.build(map, self);
        }

        public ListGroupsForUserResponseBodyGroupsGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListGroupsForUserResponseBodyGroupsGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsForUserResponseBodyGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupsForUserResponseBodyGroupsGroup setJoinDate(String joinDate) {
            this.joinDate = joinDate;
            return this;
        }
        public String getJoinDate() {
            return this.joinDate;
        }

    }

    public static class ListGroupsForUserResponseBodyGroups extends TeaModel {
        @NameInMap("Group")
        public java.util.List<ListGroupsForUserResponseBodyGroupsGroup> group;

        public static ListGroupsForUserResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseBodyGroups self = new ListGroupsForUserResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForUserResponseBodyGroups setGroup(java.util.List<ListGroupsForUserResponseBodyGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<ListGroupsForUserResponseBodyGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
