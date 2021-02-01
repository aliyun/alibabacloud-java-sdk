// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    public static GetTrainAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainAlgorithmRequest self = new GetTrainAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainAlgorithmRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public GetTrainAlgorithmRequest setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
        return this;
    }
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

}
