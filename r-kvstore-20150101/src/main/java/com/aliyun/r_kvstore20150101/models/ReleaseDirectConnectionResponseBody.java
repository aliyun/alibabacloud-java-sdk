// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ReleaseDirectConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseDirectConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDirectConnectionResponseBody self = new ReleaseDirectConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseDirectConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
