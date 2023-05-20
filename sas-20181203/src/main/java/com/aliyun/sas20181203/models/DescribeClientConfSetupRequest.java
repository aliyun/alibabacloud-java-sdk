// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfSetupRequest extends TeaModel {
    @NameInMap("StrategyTag")
    public String strategyTag;

    @NameInMap("StrategyTagValue")
    public String strategyTagValue;

    public static DescribeClientConfSetupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientConfSetupRequest self = new DescribeClientConfSetupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientConfSetupRequest setStrategyTag(String strategyTag) {
        this.strategyTag = strategyTag;
        return this;
    }
    public String getStrategyTag() {
        return this.strategyTag;
    }

    public DescribeClientConfSetupRequest setStrategyTagValue(String strategyTagValue) {
        this.strategyTagValue = strategyTagValue;
        return this;
    }
    public String getStrategyTagValue() {
        return this.strategyTagValue;
    }

}
