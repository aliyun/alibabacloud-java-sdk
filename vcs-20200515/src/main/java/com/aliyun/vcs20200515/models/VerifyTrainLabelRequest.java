// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyTrainLabelRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("LabelName")
    public String labelName;

    public static VerifyTrainLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyTrainLabelRequest self = new VerifyTrainLabelRequest();
        return TeaModel.build(map, self);
    }

    public VerifyTrainLabelRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public VerifyTrainLabelRequest setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

}
