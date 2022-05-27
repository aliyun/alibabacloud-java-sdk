// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRequest self = new DeleteServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
