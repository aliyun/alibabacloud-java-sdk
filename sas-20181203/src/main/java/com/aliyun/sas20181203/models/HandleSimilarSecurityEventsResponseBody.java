// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A3653911-33A6-5268-8B91-7690471F7AA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static HandleSimilarSecurityEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarSecurityEventsResponseBody self = new HandleSimilarSecurityEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleSimilarSecurityEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
