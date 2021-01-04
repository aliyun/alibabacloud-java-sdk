// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class EnableSmartAGDpiMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableSmartAGDpiMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSmartAGDpiMonitorResponseBody self = new EnableSmartAGDpiMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSmartAGDpiMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
