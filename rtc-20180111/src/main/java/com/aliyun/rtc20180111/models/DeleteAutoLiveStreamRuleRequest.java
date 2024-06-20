// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAutoLiveStreamRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteAutoLiveStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoLiveStreamRuleRequest self = new DeleteAutoLiveStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoLiveStreamRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAutoLiveStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAutoLiveStreamRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
