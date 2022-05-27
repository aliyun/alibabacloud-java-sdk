// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateTagTaskRequest extends TeaModel {
    @NameInMap("LabelsetId")
    public Long labelsetId;

    public static CreateTagTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagTaskRequest self = new CreateTagTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagTaskRequest setLabelsetId(Long labelsetId) {
        this.labelsetId = labelsetId;
        return this;
    }
    public Long getLabelsetId() {
        return this.labelsetId;
    }

}
