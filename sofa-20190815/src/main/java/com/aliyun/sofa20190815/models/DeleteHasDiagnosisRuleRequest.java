// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisRuleRequest extends TeaModel {
    @NameInMap("DiagRuleId")
    public String diagRuleId;

    public static DeleteHasDiagnosisRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisRuleRequest self = new DeleteHasDiagnosisRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisRuleRequest setDiagRuleId(String diagRuleId) {
        this.diagRuleId = diagRuleId;
        return this;
    }
    public String getDiagRuleId() {
        return this.diagRuleId;
    }

}
