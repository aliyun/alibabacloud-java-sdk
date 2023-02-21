// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMetricsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the IDs of instances.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The keys of the Enhanced Monitoring metrics that you want to display for the instance. You can enter a maximum of 30 metric keys. If you enter multiple metric keys, you must separate the metric keys with commas (,).</p>
     * <br>
     * <p>You can call the [DescribeAvailableMetrics](~~314326~~) operation to query the keys of metrics.</p>
     */
    @NameInMap("MetricsConfig")
    public String metricsConfig;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The application scope of this modification. Valid values:</p>
     * <br>
     * <p>*   **instance**: This modification is applied only to the current instance.</p>
     * <p>*   **region**: This modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with the same type of storage media as the current instance in the region to which the current instance belongs. For example, if the current instance is equipped with standard SSDs or enhanced SSDs (ESSDs), this modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with standard SSDs or ESSDs in the region to which the current instance belongs.</p>
     */
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
