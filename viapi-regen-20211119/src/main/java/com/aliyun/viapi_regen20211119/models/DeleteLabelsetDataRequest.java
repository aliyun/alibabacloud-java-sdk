// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteLabelsetDataRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("LabelId")
    public Long labelId;

    public static DeleteLabelsetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelsetDataRequest self = new DeleteLabelsetDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLabelsetDataRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLabelsetDataRequest setLabelId(Long labelId) {
        this.labelId = labelId;
        return this;
    }
    public Long getLabelId() {
        return this.labelId;
    }

}
