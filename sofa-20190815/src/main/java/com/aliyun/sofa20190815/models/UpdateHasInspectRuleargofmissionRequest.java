// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectRuleargofmissionRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasInspectRuleargofmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectRuleargofmissionRequest self = new UpdateHasInspectRuleargofmissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectRuleargofmissionRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

    public UpdateHasInspectRuleargofmissionRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateHasInspectRuleargofmissionRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
