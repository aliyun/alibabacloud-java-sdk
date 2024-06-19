// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>88F850B5-CC68-48B4-83CA-5497C3C191DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseInstancePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionResponseBody self = new ReleaseInstancePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
