// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythontaskRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectPythontaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythontaskRequest self = new GetHasInspectPythontaskRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythontaskRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
