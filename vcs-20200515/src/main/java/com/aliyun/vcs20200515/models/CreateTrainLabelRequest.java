// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateTrainLabelRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("LabelName")
    public String labelName;

    public static CreateTrainLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainLabelRequest self = new CreateTrainLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainLabelRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateTrainLabelRequest setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

}
