// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CancelPolarxOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelPolarxOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPolarxOrderResponseBody self = new CancelPolarxOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPolarxOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
