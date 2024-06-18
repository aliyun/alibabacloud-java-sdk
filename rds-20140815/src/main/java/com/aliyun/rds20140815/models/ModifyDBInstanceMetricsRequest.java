// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMetricsRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1s1j103lo6****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The keys of the Enhanced Monitoring metrics that you want to display for the instance. You can enter a maximum of 30 metric keys. If you enter multiple metric keys, you must separate the metric keys with commas (,).</p>
     * <p>You can call the DescribeAvailableMetrics operation to query the keys of metrics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>os.cpu_usage.sys.avg,os.cpu_usage.user.avg</p>
     */
    @NameInMap("MetricsConfig")
    public String metricsConfig;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The application scope of this modification. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: This modification is applied only to the current instance.</li>
     * <li><strong>region</strong>: This modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with the same type of storage media as the current instance in the region to which the current instance belongs. For example, if the current instance is equipped with cloud disks, this modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with cloud disks in the region to which the current instance belongs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
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
