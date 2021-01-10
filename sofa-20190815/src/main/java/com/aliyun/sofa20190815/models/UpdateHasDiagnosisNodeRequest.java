// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDiagnosisNodeRequest extends TeaModel {
    @NameInMap("DiagPlanNodeId")
    public String diagPlanNodeId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasDiagnosisNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDiagnosisNodeRequest self = new UpdateHasDiagnosisNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasDiagnosisNodeRequest setDiagPlanNodeId(String diagPlanNodeId) {
        this.diagPlanNodeId = diagPlanNodeId;
        return this;
    }
    public String getDiagPlanNodeId() {
        return this.diagPlanNodeId;
    }

    public UpdateHasDiagnosisNodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
