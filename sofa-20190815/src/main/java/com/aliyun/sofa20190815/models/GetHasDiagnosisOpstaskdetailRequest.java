// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisOpstaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisOpstaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisOpstaskdetailRequest self = new GetHasDiagnosisOpstaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisOpstaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
