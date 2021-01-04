// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SetSagRouteableAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetSagRouteableAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSagRouteableAddressResponseBody self = new SetSagRouteableAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSagRouteableAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
