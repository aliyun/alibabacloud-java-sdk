// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisAtomicofruledetailRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("DiagRuleId")
    public String diagRuleId;

    public static GetHasDiagnosisAtomicofruledetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisAtomicofruledetailRequest self = new GetHasDiagnosisAtomicofruledetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisAtomicofruledetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetHasDiagnosisAtomicofruledetailRequest setDiagRuleId(String diagRuleId) {
        this.diagRuleId = diagRuleId;
        return this;
    }
    public String getDiagRuleId() {
        return this.diagRuleId;
    }

}
