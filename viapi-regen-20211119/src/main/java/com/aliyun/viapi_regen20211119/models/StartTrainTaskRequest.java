// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartTrainTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static StartTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTrainTaskRequest self = new StartTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartTrainTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
