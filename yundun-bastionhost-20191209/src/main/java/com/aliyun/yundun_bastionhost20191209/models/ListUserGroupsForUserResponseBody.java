// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserGroupsForUserResponseBody extends TeaModel {
    /**
     * <p>The total number of user groups returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of user groups.</p>
     */
    @NameInMap("UserGroups")
    public java.util.List<ListUserGroupsForUserResponseBodyUserGroups> userGroups;

    public static ListUserGroupsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForUserResponseBody self = new ListUserGroupsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForUserResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListUserGroupsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsForUserResponseBody setUserGroups(java.util.List<ListUserGroupsForUserResponseBodyUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<ListUserGroupsForUserResponseBodyUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class ListUserGroupsForUserResponseBodyUserGroups extends TeaModel {
        /**
         * <p>The remarks of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the project to which the user group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The name of the project to which the user group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static ListUserGroupsForUserResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForUserResponseBodyUserGroups self = new ListUserGroupsForUserResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForUserResponseBodyUserGroups setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUserGroupsForUserResponseBodyUserGroups setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListUserGroupsForUserResponseBodyUserGroups setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListUserGroupsForUserResponseBodyUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListUserGroupsForUserResponseBodyUserGroups setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
