// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainTaskEstimatedTimeRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetTrainTaskEstimatedTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainTaskEstimatedTimeRequest self = new GetTrainTaskEstimatedTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainTaskEstimatedTimeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
