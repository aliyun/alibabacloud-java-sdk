// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>a0d2e04c-159d-40a8-b240-d2f2c263\\*\\*\\*\\*</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>test</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
