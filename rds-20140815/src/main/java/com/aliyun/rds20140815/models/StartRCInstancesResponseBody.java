// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstancesResponseBody self = new StartRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
