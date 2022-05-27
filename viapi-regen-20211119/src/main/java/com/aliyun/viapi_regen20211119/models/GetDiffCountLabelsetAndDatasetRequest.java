// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetDiffCountLabelsetAndDatasetRequest extends TeaModel {
    @NameInMap("LabelsetId")
    public Long labelsetId;

    public static GetDiffCountLabelsetAndDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiffCountLabelsetAndDatasetRequest self = new GetDiffCountLabelsetAndDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetDiffCountLabelsetAndDatasetRequest setLabelsetId(Long labelsetId) {
        this.labelsetId = labelsetId;
        return this;
    }
    public Long getLabelsetId() {
        return this.labelsetId;
    }

}
