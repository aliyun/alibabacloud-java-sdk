// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class InstanceConfigDto extends TeaModel {
    /**
     * <p>The configuration item name.</p>
     * 
     * <strong>example:</strong>
     * <p>storage_root_path</p>
     */
    @NameInMap("configKey")
    public String configKey;

    /**
     * <p>The configuration type.</p>
     * 
     * <strong>example:</strong>
     * <p>BE</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <p>The configuration item value.</p>
     * 
     * <strong>example:</strong>
     * <p>value1</p>
     */
    @NameInMap("configValue")
    public String configValue;

    /**
     * <p>The compute group ID, which is required only when the parameter is exclusive to the compute group. In other scenarios, leave it empty or set it to the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-e24924dxxxxx</p>
     */
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    public static InstanceConfigDto build(java.util.Map<String, ?> map) throws Exception {
        InstanceConfigDto self = new InstanceConfigDto();
        return TeaModel.build(map, self);
    }

    public InstanceConfigDto setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public InstanceConfigDto setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public InstanceConfigDto setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public InstanceConfigDto setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
