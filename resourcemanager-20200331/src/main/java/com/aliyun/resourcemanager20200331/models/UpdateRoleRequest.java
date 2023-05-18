// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    /**
     * <p>The document of the policy that specifies the trusted entity to assume the RAM role.</p>
     */
    @NameInMap("NewAssumeRolePolicyDocument")
    public String newAssumeRolePolicyDocument;

    /**
     * <p>The description of the RAM role.</p>
     * <br>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The maximum session duration of the RAM role.</p>
     * <br>
     * <p>Unit: seconds. Valid values: 3600 to 43200. Default value: 3600.</p>
     * <br>
     * <p>If you do not specify this parameter, the default value is used.</p>
     */
    @NameInMap("NewMaxSessionDuration")
    public Long newMaxSessionDuration;

    /**
     * <p>The name of the RAM role.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.),and hyphens (-).</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setNewAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
        this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
        return this;
    }
    public String getNewAssumeRolePolicyDocument() {
        return this.newAssumeRolePolicyDocument;
    }

    public UpdateRoleRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateRoleRequest setNewMaxSessionDuration(Long newMaxSessionDuration) {
        this.newMaxSessionDuration = newMaxSessionDuration;
        return this;
    }
    public Long getNewMaxSessionDuration() {
        return this.newMaxSessionDuration;
    }

    public UpdateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
