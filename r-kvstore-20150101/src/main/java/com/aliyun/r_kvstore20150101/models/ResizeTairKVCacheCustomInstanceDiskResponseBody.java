// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ResizeTairKVCacheCustomInstanceDiskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20905403119****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
     */
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
