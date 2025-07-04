// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AcceptRCInquiredSystemEventResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AcceptRCInquiredSystemEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptRCInquiredSystemEventResponseBody self = new AcceptRCInquiredSystemEventResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptRCInquiredSystemEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
