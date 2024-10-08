// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableBruteForceRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5EFF53F7-9B2A-58B5-AD06-6B07ACE17133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableBruteForceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableBruteForceRecordResponseBody self = new DisableBruteForceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableBruteForceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
