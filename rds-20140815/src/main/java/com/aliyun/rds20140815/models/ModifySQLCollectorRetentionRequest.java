// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorRetentionRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConfigValue")
    @Validation(required = true)
    public String configValue;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifySQLCollectorRetentionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorRetentionRequest self = new ModifySQLCollectorRetentionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorRetentionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifySQLCollectorRetentionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySQLCollectorRetentionRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public ModifySQLCollectorRetentionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
