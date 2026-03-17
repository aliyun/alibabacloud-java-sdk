// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisableSmartAGDpiMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>64966488-B3E3-41E2-9570-4596117EC12E</p>
     */
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
