// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterCustomModelRequest extends TeaModel {
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
     * <p>The key of the custom model registration to delete.</p>
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

    public static DeleteAIDBClusterCustomModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterCustomModelRequest self = new DeleteAIDBClusterCustomModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterCustomModelRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAIDBClusterCustomModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DeleteAIDBClusterCustomModelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
