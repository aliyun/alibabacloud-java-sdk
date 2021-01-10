// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopLinkelinkflowLinkflowProcessRequest extends TeaModel {
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static StopLinkelinkflowLinkflowProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLinkelinkflowLinkflowProcessRequest self = new StopLinkelinkflowLinkflowProcessRequest();
        return TeaModel.build(map, self);
    }

    public StopLinkelinkflowLinkflowProcessRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
