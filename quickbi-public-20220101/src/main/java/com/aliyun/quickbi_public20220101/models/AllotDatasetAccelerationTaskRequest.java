// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AllotDatasetAccelerationTaskRequest extends TeaModel {
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
