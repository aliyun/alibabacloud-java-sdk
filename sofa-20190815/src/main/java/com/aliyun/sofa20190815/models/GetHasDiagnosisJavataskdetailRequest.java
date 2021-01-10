// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisJavataskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisJavataskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisJavataskdetailRequest self = new GetHasDiagnosisJavataskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisJavataskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
