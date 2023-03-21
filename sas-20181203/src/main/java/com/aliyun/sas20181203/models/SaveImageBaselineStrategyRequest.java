// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveImageBaselineStrategyRequest extends TeaModel {
    @NameInMap("BaselineItemList")
    public String baselineItemList;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    public Long strategyId;

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
