// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ProxyConfigurationKey")
    @Validation(required = true)
    public String proxyConfigurationKey;

    @NameInMap("ProxyConfigurationValue")
    @Validation(required = true)
    public String proxyConfigurationValue;

    public static ModifyDBInstanceProxyConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceProxyConfigurationRequest self = new ModifyDBInstanceProxyConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceProxyConfigurationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceProxyConfigurationRequest setProxyConfigurationKey(String proxyConfigurationKey) {
        this.proxyConfigurationKey = proxyConfigurationKey;
        return this;
    }
    public String getProxyConfigurationKey() {
        return this.proxyConfigurationKey;
    }

    public ModifyDBInstanceProxyConfigurationRequest setProxyConfigurationValue(String proxyConfigurationValue) {
        this.proxyConfigurationValue = proxyConfigurationValue;
        return this;
    }
    public String getProxyConfigurationValue() {
        return this.proxyConfigurationValue;
    }

}
