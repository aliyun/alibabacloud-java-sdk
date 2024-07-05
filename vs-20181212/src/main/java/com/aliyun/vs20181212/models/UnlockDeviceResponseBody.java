// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnlockDeviceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>323884****9092996</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnlockDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockDeviceResponseBody self = new UnlockDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UnlockDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
