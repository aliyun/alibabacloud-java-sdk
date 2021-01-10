// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertRuleRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("RulesJsonStr")
    public String rulesJsonStr;

    public static UpdateRmsAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertRuleRequest self = new UpdateRmsAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertRuleRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public UpdateRmsAlertRuleRequest setRulesJsonStr(String rulesJsonStr) {
        this.rulesJsonStr = rulesJsonStr;
        return this;
    }
    public String getRulesJsonStr() {
        return this.rulesJsonStr;
    }

}
