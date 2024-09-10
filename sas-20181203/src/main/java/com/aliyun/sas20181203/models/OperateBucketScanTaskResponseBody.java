// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateBucketScanTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateBucketScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateBucketScanTaskResponseBody self = new OperateBucketScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateBucketScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
