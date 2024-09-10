// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreIdcProbeScanResultResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E30282D8-AB2D-5EB1-998B-2DDFA948D49D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreIdcProbeScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreIdcProbeScanResultResponseBody self = new IgnoreIdcProbeScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreIdcProbeScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
