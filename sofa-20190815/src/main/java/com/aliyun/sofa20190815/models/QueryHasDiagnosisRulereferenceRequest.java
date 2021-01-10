// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRulereferenceRequest extends TeaModel {
    @NameInMap("DiagRuleId")
    public String diagRuleId;

    public static QueryHasDiagnosisRulereferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRulereferenceRequest self = new QueryHasDiagnosisRulereferenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRulereferenceRequest setDiagRuleId(String diagRuleId) {
        this.diagRuleId = diagRuleId;
        return this;
    }
    public String getDiagRuleId() {
        return this.diagRuleId;
    }

}
