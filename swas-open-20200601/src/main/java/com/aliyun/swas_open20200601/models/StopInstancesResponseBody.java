// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StopInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponseBody self = new StopInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
