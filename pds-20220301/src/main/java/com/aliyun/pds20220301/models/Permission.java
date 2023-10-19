// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Permission extends TeaModel {
    @NameInMap("action_list")
    public java.util.List<PermissionActionList> actionList;

    @NameInMap("collection")
    public String collection;

    @NameInMap("condition")
    public PermissionCondition condition;

    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("effect")
    public String effect;

    @NameInMap("identity_id")
    public String identityId;

    @NameInMap("identity_type")
    public String identityType;

    @NameInMap("resource")
    public String resource;

    @NameInMap("resource_type")
    public String resourceType;

    @NameInMap("updated_at")
    public Long updatedAt;

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
