// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGUserAccelerateConfigResponseBody extends TeaModel {
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
