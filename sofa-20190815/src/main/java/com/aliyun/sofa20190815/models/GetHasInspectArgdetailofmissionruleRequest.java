// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectArgdetailofmissionruleRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    @NameInMap("RuleId")
    public String ruleId;

    public static GetHasInspectArgdetailofmissionruleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectArgdetailofmissionruleRequest self = new GetHasInspectArgdetailofmissionruleRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectArgdetailofmissionruleRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

    public GetHasInspectArgdetailofmissionruleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
