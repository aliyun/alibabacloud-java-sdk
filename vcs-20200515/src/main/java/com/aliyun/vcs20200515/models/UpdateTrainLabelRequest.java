// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateTrainLabelRequest extends TeaModel {
    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("LabelName")
    public String labelName;

    public static UpdateTrainLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainLabelRequest self = new UpdateTrainLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrainLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public UpdateTrainLabelRequest setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

}
