// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveImageBaselineStrategyRequest extends TeaModel {
    /**
     * <p>The baseline check items.</p>
     * <br>
     * <p>> You can call the [DescribeImageBaselineStrategy](~~DescribeImageBaselineStrategy~~) operation to query baseline check items.</p>
     */
    @NameInMap("BaselineItemList")
    public String baselineItemList;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the baseline check policy.</p>
     * <br>
     * <p>> You can call the [DescribeImageBaselineStrategy](~~DescribeImageBaselineStrategy~~) operation to query the IDs of baseline check policies.</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The name of the baseline check policy.</p>
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
