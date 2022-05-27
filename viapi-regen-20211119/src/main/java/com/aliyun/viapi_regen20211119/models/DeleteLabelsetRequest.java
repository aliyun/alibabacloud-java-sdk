// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteLabelsetRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteLabelsetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelsetRequest self = new DeleteLabelsetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLabelsetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
