// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainAlgorithRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("Version")
    public String version;

    public static GetTrainAlgorithRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainAlgorithRequest self = new GetTrainAlgorithRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainAlgorithRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public GetTrainAlgorithRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
