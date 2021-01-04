// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSagStaticRouteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSagStaticRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSagStaticRouteResponseBody self = new CreateSagStaticRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSagStaticRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
