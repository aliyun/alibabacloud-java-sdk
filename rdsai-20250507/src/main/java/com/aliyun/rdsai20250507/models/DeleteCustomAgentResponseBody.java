// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static DeleteCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAgentResponseBody self = new DeleteCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCustomAgentResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
