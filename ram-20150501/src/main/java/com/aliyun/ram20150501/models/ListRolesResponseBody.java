// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The marker. This parameter is returned only if the value of `IsTruncated` is `true`. If the value is `true`, you can call this operation again and set the `Marker` parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of RAM roles.</p>
     */
    @NameInMap("Roles")
    public ListRolesResponseBodyRoles roles;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListRolesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setRoles(ListRolesResponseBodyRoles roles) {
        this.roles = roles;
        return this;
    }
    public ListRolesResponseBodyRoles getRoles() {
        return this.roles;
    }

    public static class ListRolesResponseBodyRolesRole extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The time when the RAM role was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the RAM role.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum session duration of the RAM role.</p>
         */
        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        /**
         * <p>The ID of the RAM role.</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the RAM role.</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The time when the RAM role was modified.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListRolesResponseBodyRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRolesRole self = new ListRolesResponseBodyRolesRole();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRolesRole setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListRolesResponseBodyRolesRole setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListRolesResponseBodyRolesRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyRolesRole setMaxSessionDuration(Long maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        public ListRolesResponseBodyRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRolesResponseBodyRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesResponseBodyRolesRole setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListRolesResponseBodyRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListRolesResponseBodyRolesRole> role;

        public static ListRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRoles self = new ListRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRoles setRole(java.util.List<ListRolesResponseBodyRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListRolesResponseBodyRolesRole> getRole() {
            return this.role;
        }

    }

}
