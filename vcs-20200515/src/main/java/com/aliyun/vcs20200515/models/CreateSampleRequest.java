// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSampleRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SampleList")
    public String sampleList;

    public static CreateSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleRequest self = new CreateSampleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateSampleRequest setSampleList(String sampleList) {
        this.sampleList = sampleList;
        return this;
    }
    public String getSampleList() {
        return this.sampleList;
    }

}
