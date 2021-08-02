// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ReleaseServiceTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseServiceTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceTestResponseBody self = new ReleaseServiceTestResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
