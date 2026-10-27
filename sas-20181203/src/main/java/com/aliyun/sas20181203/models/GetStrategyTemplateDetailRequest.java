// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetStrategyTemplateDetailRequest extends TeaModel {
    /**
     * <p>The rule template ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~GetOpaStrategyTemplateSummary~~">GetOpaStrategyTemplateSummary</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
