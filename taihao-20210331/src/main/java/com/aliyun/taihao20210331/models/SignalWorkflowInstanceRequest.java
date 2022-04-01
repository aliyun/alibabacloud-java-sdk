// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SignalWorkflowInstanceRequest extends TeaModel {
    @NameInMap("SignalWorkflowInstanceParam")
    public SignalWorkflowInstanceParam signalWorkflowInstanceParam;

    public static SignalWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SignalWorkflowInstanceRequest self = new SignalWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SignalWorkflowInstanceRequest setSignalWorkflowInstanceParam(SignalWorkflowInstanceParam signalWorkflowInstanceParam) {
        this.signalWorkflowInstanceParam = signalWorkflowInstanceParam;
        return this;
    }
    public SignalWorkflowInstanceParam getSignalWorkflowInstanceParam() {
        return this.signalWorkflowInstanceParam;
    }

}
