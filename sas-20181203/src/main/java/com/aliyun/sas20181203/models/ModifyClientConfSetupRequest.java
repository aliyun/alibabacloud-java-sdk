// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfSetupRequest extends TeaModel {
    @NameInMap("StrategyConfig")
    public String strategyConfig;

    @NameInMap("StrategyTag")
    public String strategyTag;

    @NameInMap("StrategyTagValue")
    public String strategyTagValue;

    public static ModifyClientConfSetupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientConfSetupRequest self = new ModifyClientConfSetupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClientConfSetupRequest setStrategyConfig(String strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }
    public String getStrategyConfig() {
        return this.strategyConfig;
    }

    public ModifyClientConfSetupRequest setStrategyTag(String strategyTag) {
        this.strategyTag = strategyTag;
        return this;
    }
    public String getStrategyTag() {
        return this.strategyTag;
    }

    public ModifyClientConfSetupRequest setStrategyTagValue(String strategyTagValue) {
        this.strategyTagValue = strategyTagValue;
        return this;
    }
    public String getStrategyTagValue() {
        return this.strategyTagValue;
    }

}
