// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAIDBClusterModelRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2ze4x2mwo81knj08a</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The new customer-facing invocation name. If this parameter is not specified, the existing invocation name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>my-flagship-chat</p>
     */
    @NameInMap("DisplayModelName")
    public String displayModelName;

    /**
     * <p>Specifies whether to only preview the change.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the target model. Select a value from the ModelName values returned by the DescribeAvailableModels operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-32B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAIDBClusterModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAIDBClusterModelRequest self = new ModifyAIDBClusterModelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAIDBClusterModelRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAIDBClusterModelRequest setDisplayModelName(String displayModelName) {
        this.displayModelName = displayModelName;
        return this;
    }
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    public ModifyAIDBClusterModelRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyAIDBClusterModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModifyAIDBClusterModelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
