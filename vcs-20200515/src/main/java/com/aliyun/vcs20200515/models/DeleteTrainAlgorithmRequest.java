// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteTrainAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static DeleteTrainAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainAlgorithmRequest self = new DeleteTrainAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrainAlgorithmRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
