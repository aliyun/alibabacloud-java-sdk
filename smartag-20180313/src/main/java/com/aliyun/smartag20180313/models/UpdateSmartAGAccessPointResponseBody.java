// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGAccessPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmartAGAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGAccessPointResponseBody self = new UpdateSmartAGAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
