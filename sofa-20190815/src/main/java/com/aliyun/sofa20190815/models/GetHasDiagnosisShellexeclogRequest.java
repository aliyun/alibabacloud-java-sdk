// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisShellexeclogRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisShellexeclogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisShellexeclogRequest self = new GetHasDiagnosisShellexeclogRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisShellexeclogRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
