// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UnschedulableNodeDetail extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<String> nodes;

    @NameInMap("Reason")
    public String reason;

    public static UnschedulableNodeDetail build(java.util.Map<String, ?> map) throws Exception {
        UnschedulableNodeDetail self = new UnschedulableNodeDetail();
        return TeaModel.build(map, self);
    }

    public UnschedulableNodeDetail setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public UnschedulableNodeDetail setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
