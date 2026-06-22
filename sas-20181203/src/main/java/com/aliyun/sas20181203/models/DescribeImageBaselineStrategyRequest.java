// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineStrategyRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data source. If this parameter is left empty, the image baseline policy is queried by default. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: image</li>
     * <li><strong>agentless</strong>: agentless.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the baseline check policy.</p>
     * 
     * <strong>example:</strong>
     * <p>8037</p>
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
