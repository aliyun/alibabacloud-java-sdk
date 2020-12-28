// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListEntitiesForPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Groups")
    public java.util.List<ListEntitiesForPolicyResponseBodyGroups> groups;

    @NameInMap("Roles")
    public java.util.List<ListEntitiesForPolicyResponseBodyRoles> roles;

    @NameInMap("Users")
    public java.util.List<ListEntitiesForPolicyResponseBodyUsers> users;

    public static ListEntitiesForPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesForPolicyResponseBody self = new ListEntitiesForPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEntitiesForPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEntitiesForPolicyResponseBody setGroups(java.util.List<ListEntitiesForPolicyResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListEntitiesForPolicyResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListEntitiesForPolicyResponseBody setRoles(java.util.List<ListEntitiesForPolicyResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<ListEntitiesForPolicyResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public ListEntitiesForPolicyResponseBody setUsers(java.util.List<ListEntitiesForPolicyResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListEntitiesForPolicyResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListEntitiesForPolicyResponseBodyGroups extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("AttachDate")
        public String attachDate;

        public static ListEntitiesForPolicyResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyGroups self = new ListEntitiesForPolicyResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListEntitiesForPolicyResponseBodyGroups setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListEntitiesForPolicyResponseBodyGroups setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyRoles extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("AttachDate")
        public String attachDate;

        @NameInMap("Arn")
        public String arn;

        @NameInMap("RoleId")
        public String roleId;

        public static ListEntitiesForPolicyResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyRoles self = new ListEntitiesForPolicyResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyRoles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEntitiesForPolicyResponseBodyRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListEntitiesForPolicyResponseBodyRoles setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListEntitiesForPolicyResponseBodyRoles setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListEntitiesForPolicyResponseBodyRoles setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyUsers extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("AttachDate")
        public String attachDate;

        public static ListEntitiesForPolicyResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyUsers self = new ListEntitiesForPolicyResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEntitiesForPolicyResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListEntitiesForPolicyResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListEntitiesForPolicyResponseBodyUsers setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

    }

}
