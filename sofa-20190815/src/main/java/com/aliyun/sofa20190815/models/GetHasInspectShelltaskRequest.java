// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShelltaskRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectShelltaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShelltaskRequest self = new GetHasInspectShelltaskRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShelltaskRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
