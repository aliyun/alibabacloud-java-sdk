// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeDrainParameters extends TeaModel {
    @NameInMap("PodFromSubProducts")
    public java.util.List<String> podFromSubProducts;

    @NameInMap("PodNames")
    public java.util.List<String> podNames;

    public static NodeDrainParameters build(java.util.Map<String, ?> map) throws Exception {
        NodeDrainParameters self = new NodeDrainParameters();
        return TeaModel.build(map, self);
    }

    public NodeDrainParameters setPodFromSubProducts(java.util.List<String> podFromSubProducts) {
        this.podFromSubProducts = podFromSubProducts;
        return this;
    }
    public java.util.List<String> getPodFromSubProducts() {
        return this.podFromSubProducts;
    }

    public NodeDrainParameters setPodNames(java.util.List<String> podNames) {
        this.podNames = podNames;
        return this;
    }
    public java.util.List<String> getPodNames() {
        return this.podNames;
    }

}
