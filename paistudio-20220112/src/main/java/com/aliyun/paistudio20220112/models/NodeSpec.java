// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeSpec extends TeaModel {
    /**
     * <p>Rule for attaching resource nodes.</p>
     */
    @NameInMap("BindingPolicy")
    public BindingPolicy bindingPolicy;

    /**
     * <p>Number of resource nodes with this specification.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>Type of supernode to use. You cannot specify both a node specification and a supernode type.</p>
     */
    @NameInMap("HyperType")
    public String hyperType;

    /**
     * <p>Type of the resource node specification.</p>
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
