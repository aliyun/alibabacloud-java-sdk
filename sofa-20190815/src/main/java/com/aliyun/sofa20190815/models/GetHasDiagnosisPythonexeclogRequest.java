// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisPythonexeclogRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasDiagnosisPythonexeclogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisPythonexeclogRequest self = new GetHasDiagnosisPythonexeclogRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisPythonexeclogRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
