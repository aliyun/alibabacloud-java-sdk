// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleUnknownThreatDetectEventResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6EBB8614-746D-555D-AB69-C801AE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static HandleUnknownThreatDetectEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleUnknownThreatDetectEventResponseBody self = new HandleUnknownThreatDetectEventResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleUnknownThreatDetectEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
