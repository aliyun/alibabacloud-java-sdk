// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartIdcProbeScanResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53CXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartIdcProbeScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartIdcProbeScanResponseBody self = new StartIdcProbeScanResponseBody();
        return TeaModel.build(map, self);
    }

    public StartIdcProbeScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
