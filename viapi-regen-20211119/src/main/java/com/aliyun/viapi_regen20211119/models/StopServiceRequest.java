// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StopServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static StopServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopServiceRequest self = new StopServiceRequest();
        return TeaModel.build(map, self);
    }

    public StopServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
