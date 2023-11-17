// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DebugPlaybookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestUuid")
    public String requestUuid;

    public static DebugPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugPlaybookResponseBody self = new DebugPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DebugPlaybookResponseBody setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

}
