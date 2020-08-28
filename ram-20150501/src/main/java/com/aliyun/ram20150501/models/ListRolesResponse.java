// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("Roles")
    @Validation(required = true)
    public ListRolesResponseRoles roles;

    public static ListRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponse self = new ListRolesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListRolesResponseRolesRole extends TeaModel {
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

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("MaxSessionDuration")
        @Validation(required = true)
        public Long maxSessionDuration;

        public static ListRolesResponseRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseRolesRole self = new ListRolesResponseRolesRole();
            return TeaModel.build(map, self);
        }

    }

    public static class ListRolesResponseRoles extends TeaModel {
        @NameInMap("Role")
        @Validation(required = true)
        public java.util.List<ListRolesResponseRolesRole> role;

        public static ListRolesResponseRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseRoles self = new ListRolesResponseRoles();
            return TeaModel.build(map, self);
        }

    }

}
