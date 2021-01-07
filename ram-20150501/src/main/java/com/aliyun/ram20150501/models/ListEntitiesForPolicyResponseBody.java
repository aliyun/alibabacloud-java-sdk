// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListEntitiesForPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Groups")
    public ListEntitiesForPolicyResponseBodyGroups groups;

    @NameInMap("Roles")
    public ListEntitiesForPolicyResponseBodyRoles roles;

    @NameInMap("Users")
    public ListEntitiesForPolicyResponseBodyUsers users;

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

    public ListEntitiesForPolicyResponseBody setGroups(ListEntitiesForPolicyResponseBodyGroups groups) {
        this.groups = groups;
        return this;
    }
    public ListEntitiesForPolicyResponseBodyGroups getGroups() {
        return this.groups;
    }

    public ListEntitiesForPolicyResponseBody setRoles(ListEntitiesForPolicyResponseBodyRoles roles) {
        this.roles = roles;
        return this;
    }
    public ListEntitiesForPolicyResponseBodyRoles getRoles() {
        return this.roles;
    }

    public ListEntitiesForPolicyResponseBody setUsers(ListEntitiesForPolicyResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListEntitiesForPolicyResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListEntitiesForPolicyResponseBodyGroupsGroup extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("AttachDate")
        public String attachDate;

        public static ListEntitiesForPolicyResponseBodyGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyGroupsGroup self = new ListEntitiesForPolicyResponseBodyGroupsGroup();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListEntitiesForPolicyResponseBodyGroupsGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListEntitiesForPolicyResponseBodyGroupsGroup setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyGroups extends TeaModel {
        @NameInMap("Group")
        public java.util.List<ListEntitiesForPolicyResponseBodyGroupsGroup> group;

        public static ListEntitiesForPolicyResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyGroups self = new ListEntitiesForPolicyResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyGroups setGroup(java.util.List<ListEntitiesForPolicyResponseBodyGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<ListEntitiesForPolicyResponseBodyGroupsGroup> getGroup() {
            return this.group;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyRolesRole extends TeaModel {
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

        public static ListEntitiesForPolicyResponseBodyRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyRolesRole self = new ListEntitiesForPolicyResponseBodyRolesRole();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyRolesRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEntitiesForPolicyResponseBodyRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListEntitiesForPolicyResponseBodyRolesRole setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListEntitiesForPolicyResponseBodyRolesRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListEntitiesForPolicyResponseBodyRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListEntitiesForPolicyResponseBodyRolesRole> role;

        public static ListEntitiesForPolicyResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyRoles self = new ListEntitiesForPolicyResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyRoles setRole(java.util.List<ListEntitiesForPolicyResponseBodyRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListEntitiesForPolicyResponseBodyRolesRole> getRole() {
            return this.role;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyUsersUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("AttachDate")
        public String attachDate;

        public static ListEntitiesForPolicyResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyUsersUser self = new ListEntitiesForPolicyResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEntitiesForPolicyResponseBodyUsersUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListEntitiesForPolicyResponseBodyUsersUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListEntitiesForPolicyResponseBodyUsersUser setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

    }

    public static class ListEntitiesForPolicyResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListEntitiesForPolicyResponseBodyUsersUser> user;

        public static ListEntitiesForPolicyResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseBodyUsers self = new ListEntitiesForPolicyResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListEntitiesForPolicyResponseBodyUsers setUser(java.util.List<ListEntitiesForPolicyResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListEntitiesForPolicyResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
