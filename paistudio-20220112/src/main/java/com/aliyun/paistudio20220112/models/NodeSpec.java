// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeSpec extends TeaModel {
    @NameInMap("BindingPolicy")
    public BindingPolicy bindingPolicy;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>ecs.g6.4xlarge</p>
     */
    @NameInMap("Type")
    public String type;

    public static NodeSpec build(java.util.Map<String, ?> map) throws Exception {
        NodeSpec self = new NodeSpec();
        return TeaModel.build(map, self);
    }

    public NodeSpec setBindingPolicy(BindingPolicy bindingPolicy) {
        this.bindingPolicy = bindingPolicy;
        return this;
    }
    public BindingPolicy getBindingPolicy() {
        return this.bindingPolicy;
    }

    public NodeSpec setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public NodeSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
