// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C286491D-4A2F-589A-B63B-D2AD3DA9BD71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateSuspiciousOverallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousOverallConfigResponseBody self = new OperateSuspiciousOverallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousOverallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
