// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class StopTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTaskResponseBody self = new StopTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
