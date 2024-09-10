// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CancelOnceTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelOnceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOnceTaskResponseBody self = new CancelOnceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOnceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
