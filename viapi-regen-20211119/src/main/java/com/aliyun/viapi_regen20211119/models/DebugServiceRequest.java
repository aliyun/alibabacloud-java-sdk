// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DebugServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Param")
    public String param;

    public static DebugServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugServiceRequest self = new DebugServiceRequest();
        return TeaModel.build(map, self);
    }

    public DebugServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DebugServiceRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
