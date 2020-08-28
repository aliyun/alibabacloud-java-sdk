// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListEntitiesForPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Groups")
    @Validation(required = true)
    public ListEntitiesForPolicyResponseGroups groups;

    @NameInMap("Users")
    @Validation(required = true)
    public ListEntitiesForPolicyResponseUsers users;

    @NameInMap("Roles")
    @Validation(required = true)
    public ListEntitiesForPolicyResponseRoles roles;

    public static ListEntitiesForPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesForPolicyResponse self = new ListEntitiesForPolicyResponse();
        return TeaModel.build(map, self);
    }

    public static class ListEntitiesForPolicyResponseGroupsGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("AttachDate")
        @Validation(required = true)
        public String attachDate;

        public static ListEntitiesForPolicyResponseGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseGroupsGroup self = new ListEntitiesForPolicyResponseGroupsGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class ListEntitiesForPolicyResponseGroups extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public java.util.List<ListEntitiesForPolicyResponseGroupsGroup> group;

        public static ListEntitiesForPolicyResponseGroups build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseGroups self = new ListEntitiesForPolicyResponseGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class ListEntitiesForPolicyResponseUsersUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("AttachDate")
        @Validation(required = true)
        public String attachDate;

        public static ListEntitiesForPolicyResponseUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseUsersUser self = new ListEntitiesForPolicyResponseUsersUser();
            return TeaModel.build(map, self);
        }

    }

    public static class ListEntitiesForPolicyResponseUsers extends TeaModel {
        @NameInMap("User")
        @Validation(required = true)
        public java.util.List<ListEntitiesForPolicyResponseUsersUser> user;

        public static ListEntitiesForPolicyResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseUsers self = new ListEntitiesForPolicyResponseUsers();
            return TeaModel.build(map, self);
        }

    }

    public static class ListEntitiesForPolicyResponseRolesRole extends TeaModel {
        @NameInMap("RoleId")
        @Validation(required = true)
        public String roleId;

        @NameInMap("RoleName")
        @Validation(required = true)
        public String roleName;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AttachDate")
        @Validation(required = true)
        public String attachDate;

        public static ListEntitiesForPolicyResponseRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseRolesRole self = new ListEntitiesForPolicyResponseRolesRole();
            return TeaModel.build(map, self);
        }

    }

    public static class ListEntitiesForPolicyResponseRoles extends TeaModel {
        @NameInMap("Role")
        @Validation(required = true)
        public java.util.List<ListEntitiesForPolicyResponseRolesRole> role;

        public static ListEntitiesForPolicyResponseRoles build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesForPolicyResponseRoles self = new ListEntitiesForPolicyResponseRoles();
            return TeaModel.build(map, self);
        }

    }

}
