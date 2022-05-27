// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainModelRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetTrainModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainModelRequest self = new GetTrainModelRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainModelRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
