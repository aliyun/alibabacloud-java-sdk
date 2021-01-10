// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisNodeRequest extends TeaModel {
    @NameInMap("DiagPlanNodeId")
    public String diagPlanNodeId;

    public static GetHasDiagnosisNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisNodeRequest self = new GetHasDiagnosisNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisNodeRequest setDiagPlanNodeId(String diagPlanNodeId) {
        this.diagPlanNodeId = diagPlanNodeId;
        return this;
    }
    public String getDiagPlanNodeId() {
        return this.diagPlanNodeId;
    }

}
