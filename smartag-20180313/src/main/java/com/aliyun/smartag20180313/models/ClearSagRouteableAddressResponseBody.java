// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ClearSagRouteableAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ClearSagRouteableAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearSagRouteableAddressResponseBody self = new ClearSagRouteableAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearSagRouteableAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
