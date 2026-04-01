// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-7d2a745b412b4601b2d47f6a768d****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <strong>example:</strong>
     * <p>t-7d2a745b412b4601b2d47f6a768d****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <strong>example:</strong>
     * <p>06B220E2-EAC5-4DBE-A1FC-1B62DB6A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunRCCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunRCCommandResponseBody self = new RunRCCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunRCCommandResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public RunRCCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public RunRCCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
