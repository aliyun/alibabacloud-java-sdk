// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class EnableApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>timer-0800-2100</p>
     */
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
