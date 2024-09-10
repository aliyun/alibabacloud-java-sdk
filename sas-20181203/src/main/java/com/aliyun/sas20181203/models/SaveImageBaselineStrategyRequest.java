// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveImageBaselineStrategyRequest extends TeaModel {
    /**
     * <p>The baseline check items.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageBaselineStrategy~~">DescribeImageBaselineStrategy</a> operation to query baseline check items.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ak_leak</p>
     */
    @NameInMap("BaselineItemList")
    public String baselineItemList;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data source. If this parameter is left empty, the baseline check policy for images is queried. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: the baseline check policy for images</li>
     * <li><strong>agentless</strong>: agentless detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the baseline check policy.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageBaselineStrategy~~">DescribeImageBaselineStrategy</a> operation to query the IDs of baseline check policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8639</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The name of the baseline check policy.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    public static SaveImageBaselineStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveImageBaselineStrategyRequest self = new SaveImageBaselineStrategyRequest();
        return TeaModel.build(map, self);
    }

    public SaveImageBaselineStrategyRequest setBaselineItemList(String baselineItemList) {
        this.baselineItemList = baselineItemList;
        return this;
    }
    public String getBaselineItemList() {
        return this.baselineItemList;
    }

    public SaveImageBaselineStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveImageBaselineStrategyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SaveImageBaselineStrategyRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public SaveImageBaselineStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

}
