// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstancesResponseBody self = new StopRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
