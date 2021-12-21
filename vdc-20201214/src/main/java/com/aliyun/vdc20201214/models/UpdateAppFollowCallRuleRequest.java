// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class UpdateAppFollowCallRuleRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 具体规则，JSON格式
    @NameInMap("Rule")
    public String rule;

    public static UpdateAppFollowCallRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppFollowCallRuleRequest self = new UpdateAppFollowCallRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppFollowCallRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppFollowCallRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

}
