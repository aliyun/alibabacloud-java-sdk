// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DebugPlaybookResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75E56B2C-C8FA-5A2F-AA08-8745E2AC33EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The UUID of the debugging task. You can use the UUID to query the result and other details of the debugging task.</p>
     * 
     * <strong>example:</strong>
     * <p>6d412cfa-0905-4567-8a83-xxxxxx</p>
     */
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
