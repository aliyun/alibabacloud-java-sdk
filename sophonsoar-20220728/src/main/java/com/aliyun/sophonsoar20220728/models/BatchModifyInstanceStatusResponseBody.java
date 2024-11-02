// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class BatchModifyInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>358E012F-B516-599D-9ED0-A1A361CDE615</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchModifyInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyInstanceStatusResponseBody self = new BatchModifyInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchModifyInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
