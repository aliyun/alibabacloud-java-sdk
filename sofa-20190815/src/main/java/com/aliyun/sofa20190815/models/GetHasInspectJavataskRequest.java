// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavataskRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectJavataskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavataskRequest self = new GetHasInspectJavataskRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavataskRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
