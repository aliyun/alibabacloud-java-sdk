// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class OlineIsvTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static OlineIsvTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OlineIsvTestResponseBody self = new OlineIsvTestResponseBody();
        return TeaModel.build(map, self);
    }

    public OlineIsvTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
