// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPodtaskRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectPodtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPodtaskRequest self = new GetHasInspectPodtaskRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPodtaskRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
