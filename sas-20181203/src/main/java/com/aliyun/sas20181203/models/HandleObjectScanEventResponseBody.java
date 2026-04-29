// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleObjectScanEventResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static HandleObjectScanEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleObjectScanEventResponseBody self = new HandleObjectScanEventResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleObjectScanEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
