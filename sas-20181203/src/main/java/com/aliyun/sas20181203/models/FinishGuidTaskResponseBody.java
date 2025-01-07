// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FinishGuidTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>08DCAABC-82E7-5EF5-A9E7-A82DC07C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FinishGuidTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FinishGuidTaskResponseBody self = new FinishGuidTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public FinishGuidTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
