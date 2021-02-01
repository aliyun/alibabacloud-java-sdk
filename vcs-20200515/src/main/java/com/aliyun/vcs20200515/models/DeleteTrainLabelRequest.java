// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteTrainLabelRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("LabelId")
    public String labelId;

    public static DeleteTrainLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainLabelRequest self = new DeleteTrainLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrainLabelRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public DeleteTrainLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
