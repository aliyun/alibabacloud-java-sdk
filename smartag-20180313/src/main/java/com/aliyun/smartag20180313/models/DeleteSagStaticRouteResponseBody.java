// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagStaticRouteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSagStaticRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagStaticRouteResponseBody self = new DeleteSagStaticRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSagStaticRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
