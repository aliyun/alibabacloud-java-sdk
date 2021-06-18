// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyProcessRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StrategyId")
    public Long strategyId;

    public static DescribeStrategyProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyProcessRequest self = new DescribeStrategyProcessRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyProcessRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStrategyProcessRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
