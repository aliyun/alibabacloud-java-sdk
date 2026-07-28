// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigRequest extends TeaModel {
    /**
     * <p>Configuration file to modify. For compute clusters, it is fixed as be.conf. For fe clusters, it is fixed as fe.conf.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>be.conf</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8*****-be</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Whether to operate cluster nodes in parallel</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ParallelOperation")
    public Boolean parallelOperation;

    /**
     * <p>JSON string of parameters and parameter values.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;param1_name&quot;:&quot;param1_value&quot;,&quot;param2_name&quot;:&quot;param2_value&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Upgrade method. If not specified, the upgrade will be performed immediately. If set to 1, the upgrade will be performed during the maintenance window.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    public static ModifyDBClusterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigRequest self = new ModifyDBClusterConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public ModifyDBClusterConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBClusterConfigRequest setParallelOperation(Boolean parallelOperation) {
        this.parallelOperation = parallelOperation;
        return this;
    }
    public Boolean getParallelOperation() {
        return this.parallelOperation;
    }

    public ModifyDBClusterConfigRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyDBClusterConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterConfigRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
