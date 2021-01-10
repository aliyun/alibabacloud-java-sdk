// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowVariablesRequest extends TeaModel {
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetLinkelinkflowLinkflowVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowVariablesRequest self = new GetLinkelinkflowLinkflowVariablesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowVariablesRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public GetLinkelinkflowLinkflowVariablesRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
