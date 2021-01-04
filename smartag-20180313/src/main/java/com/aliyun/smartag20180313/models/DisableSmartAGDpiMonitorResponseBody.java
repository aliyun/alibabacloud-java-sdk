// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisableSmartAGDpiMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableSmartAGDpiMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSmartAGDpiMonitorResponseBody self = new DisableSmartAGDpiMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSmartAGDpiMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
