// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateTrainAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmName")
    public String algorithmName;

    public static UpdateTrainAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainAlgorithmRequest self = new UpdateTrainAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrainAlgorithmRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public UpdateTrainAlgorithmRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

}
