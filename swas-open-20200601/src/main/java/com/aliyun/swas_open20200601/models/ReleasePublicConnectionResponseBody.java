// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ReleasePublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicConnectionResponseBody self = new ReleasePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
