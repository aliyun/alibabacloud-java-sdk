// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSoarStrategyTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>43313389-DED8-5BB7-8CB9-F22CDEB744DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the policy task.</p>
     * 
     * <strong>example:</strong>
     * <p>10688</p>
     */
    @NameInMap("StrategyTaskId")
    public Long strategyTaskId;

    public static CreateSoarStrategyTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSoarStrategyTaskResponseBody self = new CreateSoarStrategyTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSoarStrategyTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSoarStrategyTaskResponseBody setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

}
