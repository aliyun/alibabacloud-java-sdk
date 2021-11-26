// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class EnableApplicationScalingRuleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static EnableApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationScalingRuleRequest self = new EnableApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EnableApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
