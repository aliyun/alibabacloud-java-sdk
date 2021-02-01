// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteMarkerRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("SampleId")
    public String sampleId;

    @NameInMap("MarkerId")
    public String markerId;

    public static DeleteMarkerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMarkerRequest self = new DeleteMarkerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMarkerRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public DeleteMarkerRequest setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public DeleteMarkerRequest setMarkerId(String markerId) {
        this.markerId = markerId;
        return this;
    }
    public String getMarkerId() {
        return this.markerId;
    }

}
