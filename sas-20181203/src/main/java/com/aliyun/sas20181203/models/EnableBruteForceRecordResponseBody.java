// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableBruteForceRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DFAECA37-4660-5EB6-9A18-8FDF56B3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableBruteForceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableBruteForceRecordResponseBody self = new EnableBruteForceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableBruteForceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
