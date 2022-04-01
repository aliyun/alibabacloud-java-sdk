// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceRequest extends TeaModel {
    @NameInMap("getWorkflowInstanceParam")
    public GetWorkflowInstanceParam getWorkflowInstanceParam;

    public static GetWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceRequest self = new GetWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceRequest setGetWorkflowInstanceParam(GetWorkflowInstanceParam getWorkflowInstanceParam) {
        this.getWorkflowInstanceParam = getWorkflowInstanceParam;
        return this;
    }
    public GetWorkflowInstanceParam getGetWorkflowInstanceParam() {
        return this.getWorkflowInstanceParam;
    }

}
