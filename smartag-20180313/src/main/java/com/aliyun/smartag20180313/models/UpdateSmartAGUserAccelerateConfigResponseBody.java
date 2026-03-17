// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGUserAccelerateConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>465B5F94-C7CF-4D54-803D-A7BEAC8545D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmartAGUserAccelerateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGUserAccelerateConfigResponseBody self = new UpdateSmartAGUserAccelerateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGUserAccelerateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
