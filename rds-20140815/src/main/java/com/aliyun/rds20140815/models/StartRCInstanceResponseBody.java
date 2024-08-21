// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstanceResponseBody self = new StartRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
