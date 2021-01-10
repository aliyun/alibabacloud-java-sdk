// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasDiagnosisNodeRequest extends TeaModel {
    @NameInMap("DiagPlanNodeId")
    public String diagPlanNodeId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static CloneHasDiagnosisNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneHasDiagnosisNodeRequest self = new CloneHasDiagnosisNodeRequest();
        return TeaModel.build(map, self);
    }

    public CloneHasDiagnosisNodeRequest setDiagPlanNodeId(String diagPlanNodeId) {
        this.diagPlanNodeId = diagPlanNodeId;
        return this;
    }
    public String getDiagPlanNodeId() {
        return this.diagPlanNodeId;
    }

    public CloneHasDiagnosisNodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
