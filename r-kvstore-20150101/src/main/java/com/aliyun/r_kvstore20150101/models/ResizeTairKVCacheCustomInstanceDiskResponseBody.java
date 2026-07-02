// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ResizeTairKVCacheCustomInstanceDiskResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ResizeTairKVCacheCustomInstanceDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeTairKVCacheCustomInstanceDiskResponseBody self = new ResizeTairKVCacheCustomInstanceDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeTairKVCacheCustomInstanceDiskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeTairKVCacheCustomInstanceDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
