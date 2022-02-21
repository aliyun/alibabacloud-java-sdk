// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyPurchasedDeviceResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPurchasedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPurchasedDeviceResponseBody self = new ModifyPurchasedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPurchasedDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPurchasedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
