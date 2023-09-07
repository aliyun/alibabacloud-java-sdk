// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetStrategyTemplateDetailRequest extends TeaModel {
    @NameInMap("StrategyId")
    public Long strategyId;

    public static GetStrategyTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStrategyTemplateDetailRequest self = new GetStrategyTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetStrategyTemplateDetailRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
