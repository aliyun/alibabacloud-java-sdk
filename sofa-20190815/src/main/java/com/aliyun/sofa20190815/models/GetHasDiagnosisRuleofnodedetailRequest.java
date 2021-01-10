// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisRuleofnodedetailRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("DiagRuleId")
    public String diagRuleId;

    public static GetHasDiagnosisRuleofnodedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisRuleofnodedetailRequest self = new GetHasDiagnosisRuleofnodedetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisRuleofnodedetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetHasDiagnosisRuleofnodedetailRequest setDiagRuleId(String diagRuleId) {
        this.diagRuleId = diagRuleId;
        return this;
    }
    public String getDiagRuleId() {
        return this.diagRuleId;
    }

}
