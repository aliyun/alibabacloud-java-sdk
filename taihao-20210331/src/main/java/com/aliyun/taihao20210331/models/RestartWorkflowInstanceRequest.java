// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RestartWorkflowInstanceRequest extends TeaModel {
    @NameInMap("restartWorkflowInstanceParam")
    public RestartWorkflowInstanceParam restartWorkflowInstanceParam;

    public static RestartWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowInstanceRequest self = new RestartWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowInstanceRequest setRestartWorkflowInstanceParam(RestartWorkflowInstanceParam restartWorkflowInstanceParam) {
        this.restartWorkflowInstanceParam = restartWorkflowInstanceParam;
        return this;
    }
    public RestartWorkflowInstanceParam getRestartWorkflowInstanceParam() {
        return this.restartWorkflowInstanceParam;
    }

}
