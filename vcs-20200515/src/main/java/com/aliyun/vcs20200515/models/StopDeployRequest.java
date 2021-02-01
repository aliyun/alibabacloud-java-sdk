// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopDeployRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static StopDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDeployRequest self = new StopDeployRequest();
        return TeaModel.build(map, self);
    }

    public StopDeployRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
