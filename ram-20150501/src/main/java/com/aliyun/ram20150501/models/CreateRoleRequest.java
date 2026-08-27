// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateRoleRequest extends TeaModel {
    /**
     * <p>Specifies whether console logon is allowed for the RAM role. Valid values:</p>
     * <ul>
     * <li>true: Console logon is allowed.</li>
     * <li>false: Console logon is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowConsoleLogin")
    public Boolean allowConsoleLogin;

    /**
     * <p>The trust policy. Specifies one or more principals that are allowed to assume the RAM role. The principal can be an Alibaba Cloud account, an Alibaba Cloud service, or an identity provider.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users cannot assume RAM roles whose trusted entity is an Alibaba Cloud service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:&quot;sts:AssumeRole&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:&quot;acs:ram::123456789012****:root&quot;}}],&quot;Version&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("AssumeRolePolicyDocument")
    public String assumeRolePolicyDocument;

    /**
     * <p>The description of the RAM role.</p>
     * <p>The description must be 1 to 1024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS management role.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum session duration of the RAM role.</p>
     * <p>Valid values: 3600 to 43200. Unit: seconds. Default value: 3600.</p>
     * <p>If you leave this parameter empty, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("MaxSessionDuration")
    public Long maxSessionDuration;

    /**
     * <p>The name of the RAM role.</p>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ECSAdmin</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRoleRequestTag> tag;

    public static CreateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleRequest self = new CreateRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoleRequest setAllowConsoleLogin(Boolean allowConsoleLogin) {
        this.allowConsoleLogin = allowConsoleLogin;
        return this;
    }
    public Boolean getAllowConsoleLogin() {
        return this.allowConsoleLogin;
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

    public CreateRoleRequest setTag(java.util.List<CreateRoleRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRoleRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateRoleRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRoleRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRoleRequestTag self = new CreateRoleRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRoleRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRoleRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
