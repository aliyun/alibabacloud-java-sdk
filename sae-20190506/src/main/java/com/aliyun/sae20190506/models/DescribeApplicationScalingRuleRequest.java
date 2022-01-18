// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRuleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static DescribeApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRuleRequest self = new DescribeApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
