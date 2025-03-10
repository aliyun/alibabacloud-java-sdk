// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>be.conf</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213c8yvv09-be</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-xxxd8a5h60y</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to perform parallel operations on the cluster node.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ParallelOperation")
    public Boolean parallelOperation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;param1\&quot;,\&quot;value\&quot;:\&quot;1234577777\&quot;},{\&quot;name\&quot;:\&quot;param2\&quot;,\&quot;value\&quot;:\&quot;${yyyyMMdd}\&quot;}]</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
