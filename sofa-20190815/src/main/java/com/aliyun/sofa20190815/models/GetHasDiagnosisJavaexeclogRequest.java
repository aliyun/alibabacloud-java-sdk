// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisJavaexeclogRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisJavaexeclogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisJavaexeclogRequest self = new GetHasDiagnosisJavaexeclogRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisJavaexeclogRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
