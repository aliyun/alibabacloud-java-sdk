// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    /**
     * <p>The description of the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales organization</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the parent user group. If this parameter is not specified, the user group is created under the root node.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>The tenant ID. This is a common parameter that can be explicitly passed by using the <code>--tenant-id</code> option in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The name of the user group. The name must be unique under the same parent node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>East China Sales</p>
     */
    @NameInMap("userGroupName")
    public String userGroupName;

    public static CreateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupRequest self = new CreateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserGroupRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateUserGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
