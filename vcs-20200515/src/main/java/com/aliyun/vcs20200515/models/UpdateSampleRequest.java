// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateSampleRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SampleId")
    public String sampleId;

    @NameInMap("LabelId")
    public String labelId;

    public static UpdateSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSampleRequest self = new UpdateSampleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSampleRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public UpdateSampleRequest setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public UpdateSampleRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
