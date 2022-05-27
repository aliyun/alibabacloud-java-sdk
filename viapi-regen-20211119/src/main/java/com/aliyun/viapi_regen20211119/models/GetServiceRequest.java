// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRequest self = new GetServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
