// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonexeclogRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectPythonexeclogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonexeclogRequest self = new GetHasInspectPythonexeclogRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonexeclogRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
