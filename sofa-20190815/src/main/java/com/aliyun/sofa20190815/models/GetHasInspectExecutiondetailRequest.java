// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectExecutiondetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectExecutiondetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectExecutiondetailRequest self = new GetHasInspectExecutiondetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectExecutiondetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
