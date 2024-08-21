// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstanceResponseBody self = new StopRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
