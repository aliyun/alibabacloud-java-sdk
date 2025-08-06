// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateIntelligentStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrategyId")
    public String strategyId;

    public static CreateIntelligentStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntelligentStrategyResponseBody self = new CreateIntelligentStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntelligentStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIntelligentStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
