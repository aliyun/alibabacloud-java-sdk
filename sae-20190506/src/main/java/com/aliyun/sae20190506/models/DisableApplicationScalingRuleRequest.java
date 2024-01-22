// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DisableApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>timer-0800-2100</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static DisableApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationScalingRuleRequest self = new DisableApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DisableApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
