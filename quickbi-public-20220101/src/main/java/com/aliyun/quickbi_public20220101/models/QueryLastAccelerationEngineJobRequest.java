// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLastAccelerationEngineJobRequest extends TeaModel {
    /**
     * <p>Dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d23d30c0-****-6c92bf668356</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    public static QueryLastAccelerationEngineJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLastAccelerationEngineJobRequest self = new QueryLastAccelerationEngineJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryLastAccelerationEngineJobRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

}
