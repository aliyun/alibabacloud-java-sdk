// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Permission extends TeaModel {
    /**
     * <p>Action list.</p>
     */
    @NameInMap("action_list")
    public java.util.List<PermissionActionList> actionList;

    /**
     * <p>The permission set. Set this parameter to global for global permissions. In other scenarios, this parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("collection")
    public String collection;

    /**
     * <p>Condition</p>
     */
    @NameInMap("condition")
    public PermissionCondition condition;

    /**
     * <p>The creation time in the millisecond timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1703648502811</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <p>Effect. Valid values: allow, deny.</p>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("effect")
    public String effect;

    /**
     * <p>Identity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>af22***</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>Identity type. Valid values: IT_User, IT_Group, IT_Role.</p>
     * 
     * <strong>example:</strong>
     * <p>IT_User</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>fa212***</p>
     */
    @NameInMap("resource")
    public String resource;

    /**
     * <p>The type of the resource. The file type resource is RT_File.</p>
     * 
     * <strong>example:</strong>
     * <p>RT_File</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The time when the modification was made. The value is a millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1703648502811</p>
     */
    @NameInMap("updated_at")
    public Long updatedAt;

    /**
     * <p>Custom tag.</p>
     */
    @NameInMap("user_tags")
    public java.util.List<String> userTags;

    public static Permission build(java.util.Map<String, ?> map) throws Exception {
        Permission self = new Permission();
        return TeaModel.build(map, self);
    }

    public Permission setActionList(java.util.List<PermissionActionList> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<PermissionActionList> getActionList() {
        return this.actionList;
    }

    public Permission setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public Permission setCondition(PermissionCondition condition) {
        this.condition = condition;
        return this;
    }
    public PermissionCondition getCondition() {
        return this.condition;
    }

    public Permission setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Permission setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public Permission setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public Permission setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public Permission setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public Permission setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Permission setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Permission setUserTags(java.util.List<String> userTags) {
        this.userTags = userTags;
        return this;
    }
    public java.util.List<String> getUserTags() {
        return this.userTags;
    }

    public static class PermissionActionList extends TeaModel {
        /**
         * <p>Specific action, such as FILE.ALL</p>
         * 
         * <strong>example:</strong>
         * <p>FILE.ALL</p>
         */
        @NameInMap("action")
        public String action;

        public static PermissionActionList build(java.util.Map<String, ?> map) throws Exception {
            PermissionActionList self = new PermissionActionList();
            return TeaModel.build(map, self);
        }

        public PermissionActionList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

    }

}
