// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteTrainTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainTaskRequest self = new DeleteTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
