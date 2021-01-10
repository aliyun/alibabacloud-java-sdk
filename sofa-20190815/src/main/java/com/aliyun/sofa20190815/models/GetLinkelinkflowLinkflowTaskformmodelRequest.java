// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTaskformmodelRequest extends TeaModel {
    @NameInMap("ProcessDefinitionId")
    public String processDefinitionId;

    @NameInMap("TaskDefinitionKey")
    public String taskDefinitionKey;

    public static GetLinkelinkflowLinkflowTaskformmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTaskformmodelRequest self = new GetLinkelinkflowLinkflowTaskformmodelRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTaskformmodelRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public GetLinkelinkflowLinkflowTaskformmodelRequest setTaskDefinitionKey(String taskDefinitionKey) {
        this.taskDefinitionKey = taskDefinitionKey;
        return this;
    }
    public String getTaskDefinitionKey() {
        return this.taskDefinitionKey;
    }

}
