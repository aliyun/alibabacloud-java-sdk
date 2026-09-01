// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DebugPlaybookResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. Use this ID to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>75E56B2C-C8FA-5A2F-AA08-8745E2AC33EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The run UUID of the debugging task. Use this UUID to query information, such as the task result.</p>
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
