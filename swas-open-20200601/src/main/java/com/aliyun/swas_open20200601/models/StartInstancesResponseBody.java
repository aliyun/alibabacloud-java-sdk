// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StartInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesResponseBody self = new StartInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
