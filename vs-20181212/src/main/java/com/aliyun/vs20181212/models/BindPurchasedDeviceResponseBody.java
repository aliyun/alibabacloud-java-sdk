// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindPurchasedDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindPurchasedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindPurchasedDeviceResponseBody self = new BindPurchasedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BindPurchasedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
