// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopTransferStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopTransferStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTransferStreamResponseBody self = new StopTransferStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTransferStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
