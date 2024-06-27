// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AllotDatasetAccelerationTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    public static AllotDatasetAccelerationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AllotDatasetAccelerationTaskRequest self = new AllotDatasetAccelerationTaskRequest();
        return TeaModel.build(map, self);
    }

    public AllotDatasetAccelerationTaskRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

}
