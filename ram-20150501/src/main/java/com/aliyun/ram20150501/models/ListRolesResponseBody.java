// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The marker. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.````</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM roles.</p>
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

    public static class ListRolesResponseBodyRolesRoleTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListRolesResponseBodyRolesRoleTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRolesRoleTagsTag self = new ListRolesResponseBodyRolesRoleTagsTag();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRolesRoleTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListRolesResponseBodyRolesRoleTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListRolesResponseBodyRolesRoleTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListRolesResponseBodyRolesRoleTagsTag> tag;

        public static ListRolesResponseBodyRolesRoleTags build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRolesRoleTags self = new ListRolesResponseBodyRolesRoleTags();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRolesRoleTags setTag(java.util.List<ListRolesResponseBodyRolesRoleTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListRolesResponseBodyRolesRoleTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListRolesResponseBodyRolesRole extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/ECSAdmin</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS administrator</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum session duration of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("MaxSessionDuration")
        public Long maxSessionDuration;

        /**
         * <p>The ID of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>901234567890****</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>ECSAdmin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public ListRolesResponseBodyRolesRoleTags tags;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
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

        public ListRolesResponseBodyRolesRole setTags(ListRolesResponseBodyRolesRoleTags tags) {
            this.tags = tags;
            return this;
        }
        public ListRolesResponseBodyRolesRoleTags getTags() {
            return this.tags;
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
