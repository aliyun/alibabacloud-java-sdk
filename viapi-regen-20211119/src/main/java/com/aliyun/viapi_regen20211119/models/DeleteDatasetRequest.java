// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteDatasetRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetRequest self = new DeleteDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
