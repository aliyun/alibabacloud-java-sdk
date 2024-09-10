// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class TriggerCheckResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>43313389-DED8-5BB7-8CB9-F22CDEB744DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerCheckResponseBody self = new TriggerCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
