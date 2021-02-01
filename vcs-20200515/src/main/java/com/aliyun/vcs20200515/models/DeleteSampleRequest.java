// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteSampleRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SampleId")
    public String sampleId;

    public static DeleteSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleRequest self = new DeleteSampleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSampleRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public DeleteSampleRequest setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

}
