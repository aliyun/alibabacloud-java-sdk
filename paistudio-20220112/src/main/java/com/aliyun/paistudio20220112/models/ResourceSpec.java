// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceSpec extends TeaModel {
    @NameInMap("NodeSpecs")
    public java.util.List<NodeSpec> nodeSpecs;

    public static ResourceSpec build(java.util.Map<String, ?> map) throws Exception {
        ResourceSpec self = new ResourceSpec();
        return TeaModel.build(map, self);
    }

    public ResourceSpec setNodeSpecs(java.util.List<NodeSpec> nodeSpecs) {
        this.nodeSpecs = nodeSpecs;
        return this;
    }
    public java.util.List<NodeSpec> getNodeSpecs() {
        return this.nodeSpecs;
    }

}
