// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsResponseBody extends TeaModel {
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
