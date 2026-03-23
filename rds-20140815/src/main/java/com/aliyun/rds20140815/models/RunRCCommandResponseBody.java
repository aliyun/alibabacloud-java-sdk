// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCCommandResponseBody extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InvokeId")
    public String invokeId;

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
