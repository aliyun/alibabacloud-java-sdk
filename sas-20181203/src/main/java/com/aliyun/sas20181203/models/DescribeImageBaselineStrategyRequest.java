// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineStrategyRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data source. Default value: default. Valid values:</p>
     * <br>
     * <p>*   **default**: queries the information about a baseline check policy for images.</p>
     * <p>*   **agentless**: queries the information about a baseline check policy for agentless detection.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the baseline check policy.</p>
     */
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

    public DescribeImageBaselineStrategyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeImageBaselineStrategyRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
