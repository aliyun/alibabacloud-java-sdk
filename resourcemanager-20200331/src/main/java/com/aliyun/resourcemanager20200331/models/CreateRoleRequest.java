// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateRoleRequest extends TeaModel {
    /**
     * <p>The content of the access policy for assuming the role.</p>
     * <p>Specifies one or more entities that are allowed to assume the role. The trusted entity can be an Alibaba Cloud account, an Alibaba Cloud service, or an identity provider.</p>
     * <blockquote>
     * <p>A Resource Access Management (RAM) user cannot assume a RAM role whose trusted entity is an Alibaba Cloud service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Statement&quot;: [ { &quot;Action&quot;: &quot;sts:AssumeRole&quot;, &quot;Effect&quot;: &quot;Allow&quot;, &quot;Principal&quot;: { &quot;RAM&quot;: &quot;acs:ram::12345678901234****:root&quot; } } ], &quot;Version&quot;: &quot;1&quot; }</p>
     */
    @NameInMap("AssumeRolePolicyDocument")
    public String assumeRolePolicyDocument;

    /**
     * <p>The description of the role.</p>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS management role</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum session duration of the role.</p>
     * <p>Valid values: 3600 to 43200. Unit: seconds. Default value: 3600.</p>
     * <p>If this parameter is left empty, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("MaxSessionDuration")
    public Long maxSessionDuration;

    /**
     * <p>The name of the role.</p>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECSAdmin</p>
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
