// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckDatasetExistedRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    public static CheckDatasetExistedRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDatasetExistedRequest self = new CheckDatasetExistedRequest();
        return TeaModel.build(map, self);
    }

    public CheckDatasetExistedRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

}
