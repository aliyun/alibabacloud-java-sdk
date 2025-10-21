// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class NodeExecutionContextDTO extends TeaModel {
    @NameInMap("context")
    public java.util.Map<String, String> context;

    public static NodeExecutionContextDTO build(java.util.Map<String, ?> map) throws Exception {
        NodeExecutionContextDTO self = new NodeExecutionContextDTO();
        return TeaModel.build(map, self);
    }

    public NodeExecutionContextDTO setContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }
    public java.util.Map<String, String> getContext() {
        return this.context;
    }

}
