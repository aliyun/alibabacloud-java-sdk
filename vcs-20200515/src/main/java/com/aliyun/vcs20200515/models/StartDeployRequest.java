// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartDeployRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static StartDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDeployRequest self = new StartDeployRequest();
        return TeaModel.build(map, self);
    }

    public StartDeployRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
