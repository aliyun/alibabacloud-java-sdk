// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartTrainRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static StartTrainRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTrainRequest self = new StartTrainRequest();
        return TeaModel.build(map, self);
    }

    public StartTrainRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
