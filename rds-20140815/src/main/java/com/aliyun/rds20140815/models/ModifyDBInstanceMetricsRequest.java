// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMetricsRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("MetricsConfig")
    public String metricsConfig;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Scope")
    public String scope;

    public static ModifyDBInstanceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMetricsRequest self = new ModifyDBInstanceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMetricsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyDBInstanceMetricsRequest setMetricsConfig(String metricsConfig) {
        this.metricsConfig = metricsConfig;
        return this;
    }
    public String getMetricsConfig() {
        return this.metricsConfig;
    }

    public ModifyDBInstanceMetricsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceMetricsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
