// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisMonitortaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisMonitortaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisMonitortaskdetailRequest self = new GetHasDiagnosisMonitortaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisMonitortaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
