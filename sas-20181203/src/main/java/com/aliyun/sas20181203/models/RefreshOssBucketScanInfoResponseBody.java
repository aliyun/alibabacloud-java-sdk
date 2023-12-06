// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshOssBucketScanInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
