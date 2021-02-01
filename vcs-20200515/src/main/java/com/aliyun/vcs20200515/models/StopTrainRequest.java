// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopTrainRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static StopTrainRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTrainRequest self = new StopTrainRequest();
        return TeaModel.build(map, self);
    }

    public StopTrainRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
