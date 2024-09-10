// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssBucketScanTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBD75EC2-2F4F-5A7B-AA53-18724DC8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOssBucketScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssBucketScanTaskResponseBody self = new CreateOssBucketScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssBucketScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
