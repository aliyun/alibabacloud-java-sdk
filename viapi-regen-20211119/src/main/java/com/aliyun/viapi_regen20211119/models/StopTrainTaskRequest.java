// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StopTrainTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static StopTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTrainTaskRequest self = new StopTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
