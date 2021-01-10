// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellexeclogRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectShellexeclogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellexeclogRequest self = new GetHasInspectShellexeclogRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellexeclogRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
