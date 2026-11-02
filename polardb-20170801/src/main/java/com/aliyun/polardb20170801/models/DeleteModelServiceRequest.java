// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteModelServiceRequest extends TeaModel {
    /**
     * <p>The gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The model name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceRequest self = new DeleteModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DeleteModelServiceRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DeleteModelServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
