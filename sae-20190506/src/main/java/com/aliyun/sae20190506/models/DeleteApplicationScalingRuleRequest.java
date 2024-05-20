// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static DeleteApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationScalingRuleRequest self = new DeleteApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
