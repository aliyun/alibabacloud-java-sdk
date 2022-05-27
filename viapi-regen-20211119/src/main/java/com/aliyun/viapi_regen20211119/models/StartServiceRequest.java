// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StartServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static StartServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartServiceRequest self = new StartServiceRequest();
        return TeaModel.build(map, self);
    }

    public StartServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
