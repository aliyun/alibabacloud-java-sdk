// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMetricsRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1s1j103lo6****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The monitoring metrics to configure for the instance. You can specify multiple metric keys separated by commas (,). A maximum of 30 metric keys can be specified.</p>
     * <p>You can call the DescribeAvailableMetrics operation to obtain the enhanced monitoring metric keys.</p>
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
     * <p>The scope of the modification. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: instance level. The modification is applied only to cloud disk instance.</li>
     * <li><strong>region</strong>: region level. The modification is applied to all ApsaraDB RDS for PostgreSQL instances that use the same storage type as cloud disk instance in the current region. For example, if cloud disk instance uses cloud disks, the modification is applied to all ApsaraDB RDS for PostgreSQL instances with cloud disks in the current region.</li>
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
