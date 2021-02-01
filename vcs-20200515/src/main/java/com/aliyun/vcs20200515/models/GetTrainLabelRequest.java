// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainLabelRequest extends TeaModel {
    @NameInMap("LabelId")
    public String labelId;

    public static GetTrainLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainLabelRequest self = new GetTrainLabelRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainLabelRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

}
