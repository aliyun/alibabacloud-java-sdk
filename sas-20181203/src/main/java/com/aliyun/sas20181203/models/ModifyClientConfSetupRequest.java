// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientConfSetupRequest extends TeaModel {
    /**
     * <p>The configurations of the Security Center agent.</p>
     * <br>
     * <p>*   cpu: the maximum CPU utilization that can be occupied by the Security Center agent on the server</p>
     * <p>*   mem: the maximum memory usage that can be occupied by the Security Center agent on the server</p>
     */
    @NameInMap("StrategyConfig")
    public String strategyConfig;

    /**
     * <p>The type of the tag.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyTag")
    public String strategyTag;

    /**
     * <p>The value of the tag. Valid values:</p>
     * <br>
     * <p>*   major</p>
     * <p>*   advanced</p>
     * <p>*   basic</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
