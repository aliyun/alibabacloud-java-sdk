// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisExecutiondetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisExecutiondetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisExecutiondetailRequest self = new GetHasDiagnosisExecutiondetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisExecutiondetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
