// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAvailableModelsRequest extends TeaModel {
    /**
     * <p>aideploy</p>
     * 
     * <strong>example:</strong>
     * <p>aideploy</p>
     */
    @NameInMap("KubeType")
    public String kubeType;

    /**
     * <p>The model type. Valid values: custom or public. If this parameter is not specified, all models are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAvailableModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableModelsRequest self = new DescribeAvailableModelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableModelsRequest setKubeType(String kubeType) {
        this.kubeType = kubeType;
        return this;
    }
    public String getKubeType() {
        return this.kubeType;
    }

    public DescribeAvailableModelsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public DescribeAvailableModelsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
