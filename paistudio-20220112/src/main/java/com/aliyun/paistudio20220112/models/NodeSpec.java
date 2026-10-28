// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeSpec extends TeaModel {
    /**
     * <p>The resource node binding policy.</p>
     */
    @NameInMap("BindingPolicy")
    public BindingPolicy bindingPolicy;

    /**
     * <p>The number of resource node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The supernode specifications in use. When you specify a specification, you cannot specify both the node specifications and the supernode at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>efg3.GN9A.ch72</p>
     */
    @NameInMap("HyperType")
    public String hyperType;

    /**
     * <p>The resource node specifications type.</p>
     * 
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

    public NodeSpec setHyperType(String hyperType) {
        this.hyperType = hyperType;
        return this;
    }
    public String getHyperType() {
        return this.hyperType;
    }

    public NodeSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
