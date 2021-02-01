// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateMarkerRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("SampleId")
    public String sampleId;

    @NameInMap("Content")
    public String content;

    public static CreateMarkerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMarkerRequest self = new CreateMarkerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMarkerRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateMarkerRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public CreateMarkerRequest setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public CreateMarkerRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
