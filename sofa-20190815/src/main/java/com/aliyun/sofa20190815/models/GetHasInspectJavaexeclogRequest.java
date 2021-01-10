// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavaexeclogRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    public static GetHasInspectJavaexeclogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavaexeclogRequest self = new GetHasInspectJavaexeclogRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavaexeclogRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
