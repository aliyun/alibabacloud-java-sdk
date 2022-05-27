// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainTaskRequest self = new GetTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
