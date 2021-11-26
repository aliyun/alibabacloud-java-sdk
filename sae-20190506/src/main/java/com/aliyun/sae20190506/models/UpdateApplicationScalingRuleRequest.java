// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("ScalingRuleTimer")
    public String scalingRuleTimer;

    public static UpdateApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleRequest self = new UpdateApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleTimer(String scalingRuleTimer) {
        this.scalingRuleTimer = scalingRuleTimer;
        return this;
    }
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

}
