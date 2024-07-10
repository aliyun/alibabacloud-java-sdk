// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>timer-0800-2100</p>
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
