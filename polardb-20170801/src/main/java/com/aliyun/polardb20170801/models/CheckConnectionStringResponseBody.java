// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckConnectionStringResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectionStringResponseBody self = new CheckConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
