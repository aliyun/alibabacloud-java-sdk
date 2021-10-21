// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SyncTrademarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SyncTrademarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncTrademarkResponseBody self = new SyncTrademarkResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncTrademarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
