// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    public Long strategyId;

    public static DescribeImageBaselineStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineStrategyRequest self = new DescribeImageBaselineStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageBaselineStrategyRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
