// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateMarkerRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("SampleId")
    public String sampleId;

    @NameInMap("Content")
    public String content;

    @NameInMap("MarkerId")
    public String markerId;

    public static UpdateMarkerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMarkerRequest self = new UpdateMarkerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMarkerRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public UpdateMarkerRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public UpdateMarkerRequest setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public UpdateMarkerRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateMarkerRequest setMarkerId(String markerId) {
        this.markerId = markerId;
        return this;
    }
    public String getMarkerId() {
        return this.markerId;
    }

}
