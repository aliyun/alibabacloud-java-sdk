// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    /**
     * <p>Specifies whether the RAM role is allowed to log on to the console.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewAllowConsoleLogin")
    public Boolean newAllowConsoleLogin;

    /**
     * <p>The trust policy of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Statement&quot;: [ { &quot;Action&quot;: &quot;sts:AssumeRole&quot;, &quot;Effect&quot;: &quot;Allow&quot;, &quot;Principal&quot;: { &quot;RAM&quot;: &quot;acs:ram::12345678901234****:root&quot; } } ], &quot;Version&quot;: &quot;1&quot; }</p>
     */
    @NameInMap("NewAssumeRolePolicyDocument")
    public String newAssumeRolePolicyDocument;

    /**
     * <p>The description of the RAM role.</p>
     * <p>The description must be 1 to 1024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS management role</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The maximum session duration of the RAM role.</p>
     * <p>Valid values: 3600 to 43200. Unit: seconds. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("NewMaxSessionDuration")
    public Long newMaxSessionDuration;

    /**
     * <p>The name of the RAM role.</p>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ECSAdmin</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setNewAllowConsoleLogin(Boolean newAllowConsoleLogin) {
        this.newAllowConsoleLogin = newAllowConsoleLogin;
        return this;
    }
    public Boolean getNewAllowConsoleLogin() {
        return this.newAllowConsoleLogin;
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
