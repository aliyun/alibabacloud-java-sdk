// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CredentialConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AliyunEnvRoleKey")
    public String aliyunEnvRoleKey;

    @NameInMap("Configs")
    public java.util.List<CredentialConfigConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    public static CredentialConfig build(java.util.Map<String, ?> map) throws Exception {
        CredentialConfig self = new CredentialConfig();
        return TeaModel.build(map, self);
    }

    public CredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
        this.aliyunEnvRoleKey = aliyunEnvRoleKey;
        return this;
    }
    public String getAliyunEnvRoleKey() {
        return this.aliyunEnvRoleKey;
    }

    public CredentialConfig setConfigs(java.util.List<CredentialConfigConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<CredentialConfigConfigs> getConfigs() {
        return this.configs;
    }

    public CredentialConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public static class CredentialConfigConfigsRolesUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LT********</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>456******</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("Type")
        public String type;

        public static CredentialConfigConfigsRolesUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CredentialConfigConfigsRolesUserInfo self = new CredentialConfigConfigsRolesUserInfo();
            return TeaModel.build(map, self);
        }

        public CredentialConfigConfigsRolesUserInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CredentialConfigConfigsRolesUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CredentialConfigConfigsRolesUserInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public CredentialConfigConfigsRolesUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CredentialConfigConfigsRoles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123******</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123******:role/****</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("UserInfo")
        public CredentialConfigConfigsRolesUserInfo userInfo;

        public static CredentialConfigConfigsRoles build(java.util.Map<String, ?> map) throws Exception {
            CredentialConfigConfigsRoles self = new CredentialConfigConfigsRoles();
            return TeaModel.build(map, self);
        }

        public CredentialConfigConfigsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CredentialConfigConfigsRoles setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CredentialConfigConfigsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CredentialConfigConfigsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CredentialConfigConfigsRoles setUserInfo(CredentialConfigConfigsRolesUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public CredentialConfigConfigsRolesUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class CredentialConfigConfigs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Roles")
        public java.util.List<CredentialConfigConfigsRoles> roles;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Role</p>
         */
        @NameInMap("Type")
        public String type;

        public static CredentialConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            CredentialConfigConfigs self = new CredentialConfigConfigs();
            return TeaModel.build(map, self);
        }

        public CredentialConfigConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CredentialConfigConfigs setRoles(java.util.List<CredentialConfigConfigsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<CredentialConfigConfigsRoles> getRoles() {
            return this.roles;
        }

        public CredentialConfigConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
