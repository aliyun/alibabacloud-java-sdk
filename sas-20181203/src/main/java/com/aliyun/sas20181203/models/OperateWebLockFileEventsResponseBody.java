// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateWebLockFileEventsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2884C186-E8C0-5611-8207-3FF15EE7D9B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateWebLockFileEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateWebLockFileEventsResponseBody self = new OperateWebLockFileEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateWebLockFileEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
