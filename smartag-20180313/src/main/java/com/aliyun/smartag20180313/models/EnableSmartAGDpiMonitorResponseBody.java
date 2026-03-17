// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class EnableSmartAGDpiMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>64966488-B3E3-41E2-9570-4596117EC12E</p>
     */
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
