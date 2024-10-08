// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomBlockRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F02D5F26-70B9-53BD-9CDF-A316FD11****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomBlockRecordResponseBody self = new EnableCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
