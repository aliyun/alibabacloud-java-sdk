// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshOssBucketScanInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE290C1F-4B7D-5024-9D2F-E26D7B08****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshOssBucketScanInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshOssBucketScanInfoResponseBody self = new RefreshOssBucketScanInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshOssBucketScanInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
