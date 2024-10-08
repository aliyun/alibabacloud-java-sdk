// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCD-PSD2-5256-1DSA-4222-JHBN</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateSuspiciousTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousTargetConfigResponseBody self = new OperateSuspiciousTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
