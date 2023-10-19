// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseAssignmentResponse extends TeaModel {
    @NameInMap("associated_role_tag_id")
    public String associatedRoleTagId;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("disinherit_sub_group")
    public Boolean disinheritSubGroup;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("identity")
    public Identity identity;

    @NameInMap("manage_resource_id")
    public String manageResourceId;

    @NameInMap("manage_resource_type")
    public String manageResourceType;

    @NameInMap("role_id")
    public String roleId;

    @NameInMap("updated_at")
    public String updatedAt;

    public static BaseAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseAssignmentResponse self = new BaseAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public BaseAssignmentResponse setAssociatedRoleTagId(String associatedRoleTagId) {
        this.associatedRoleTagId = associatedRoleTagId;
        return this;
    }
    public String getAssociatedRoleTagId() {
        return this.associatedRoleTagId;
    }

    public BaseAssignmentResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BaseAssignmentResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseAssignmentResponse setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public BaseAssignmentResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseAssignmentResponse setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public BaseAssignmentResponse setManageResourceId(String manageResourceId) {
        this.manageResourceId = manageResourceId;
        return this;
    }
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    public BaseAssignmentResponse setManageResourceType(String manageResourceType) {
        this.manageResourceType = manageResourceType;
        return this;
    }
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    public BaseAssignmentResponse setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public BaseAssignmentResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
