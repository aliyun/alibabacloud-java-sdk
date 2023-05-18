// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateRoleRequest extends TeaModel {
    /**
     * <p>The document of the policy that specifies one or more trusted entities to assume the RAM role. The trusted entities can be Alibaba Cloud accounts, Alibaba Cloud services, or identity providers (IdPs).</p>
     * <br>
     * <p>>  RAM users cannot assume the RAM roles of trusted Alibaba Cloud services.</p>
     */
    @NameInMap("AssumeRolePolicyDocument")
    public String assumeRolePolicyDocument;

    /**
     * <p>The description of the RAM role.</p>
     * <br>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum session duration of the RAM role.</p>
     * <br>
     * <p>Unit: seconds. Valid values: 3600 to 43200. Default value: 3600.</p>
     * <br>
     * <p>If you do not specify this parameter, the default value is used.</p>
     */
    @NameInMap("MaxSessionDuration")
    public Long maxSessionDuration;

    /**
     * <p>The name of the RAM role.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static CreateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleRequest self = new CreateRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoleRequest setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }
    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    public CreateRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRoleRequest setMaxSessionDuration(Long maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }
    public Long getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    public CreateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
