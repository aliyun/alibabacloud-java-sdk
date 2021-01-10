// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowStartformmodelRequest extends TeaModel {
    @NameInMap("ProcessDefinitionKey")
    public String processDefinitionKey;

    public static GetLinkelinkflowLinkflowStartformmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowStartformmodelRequest self = new GetLinkelinkflowLinkflowStartformmodelRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowStartformmodelRequest setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }
    public String getProcessDefinitionKey() {
        return this.processDefinitionKey;
    }

}
