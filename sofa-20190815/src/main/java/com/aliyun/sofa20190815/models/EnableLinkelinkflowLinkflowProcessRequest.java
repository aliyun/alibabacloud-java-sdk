// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkelinkflowLinkflowProcessRequest extends TeaModel {
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static EnableLinkelinkflowLinkflowProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkelinkflowLinkflowProcessRequest self = new EnableLinkelinkflowLinkflowProcessRequest();
        return TeaModel.build(map, self);
    }

    public EnableLinkelinkflowLinkflowProcessRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
