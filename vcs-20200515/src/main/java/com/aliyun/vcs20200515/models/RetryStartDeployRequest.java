// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RetryStartDeployRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static RetryStartDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryStartDeployRequest self = new RetryStartDeployRequest();
        return TeaModel.build(map, self);
    }

    public RetryStartDeployRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
