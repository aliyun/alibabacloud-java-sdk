// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDiagnosisRuleRequest extends TeaModel {
    @NameInMap("DiagRuleId")
    public String diagRuleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasDiagnosisRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDiagnosisRuleRequest self = new UpdateHasDiagnosisRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasDiagnosisRuleRequest setDiagRuleId(String diagRuleId) {
        this.diagRuleId = diagRuleId;
        return this;
    }
    public String getDiagRuleId() {
        return this.diagRuleId;
    }

    public UpdateHasDiagnosisRuleRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
