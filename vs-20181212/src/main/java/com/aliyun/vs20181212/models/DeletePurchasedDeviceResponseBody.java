// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePurchasedDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePurchasedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePurchasedDeviceResponseBody self = new DeletePurchasedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePurchasedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
