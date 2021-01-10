// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDiagnosisRuleargofnodeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("DiagRuleId")
    public String diagRuleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasDiagnosisRuleargofnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDiagnosisRuleargofnodeRequest self = new UpdateHasDiagnosisRuleargofnodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasDiagnosisRuleargofnodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateHasDiagnosisRuleargofnodeRequest setDiagRuleId(String diagRuleId) {
        this.diagRuleId = diagRuleId;
        return this;
    }
    public String getDiagRuleId() {
        return this.diagRuleId;
    }

    public UpdateHasDiagnosisRuleargofnodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
