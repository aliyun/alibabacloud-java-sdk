// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AllocateStrategySpec extends TeaModel {
    @NameInMap("NodeSpecs")
    public java.util.List<NodeSpec> nodeSpecs;

    public static AllocateStrategySpec build(java.util.Map<String, ?> map) throws Exception {
        AllocateStrategySpec self = new AllocateStrategySpec();
        return TeaModel.build(map, self);
    }

    public AllocateStrategySpec setNodeSpecs(java.util.List<NodeSpec> nodeSpecs) {
        this.nodeSpecs = nodeSpecs;
        return this;
    }
    public java.util.List<NodeSpec> getNodeSpecs() {
        return this.nodeSpecs;
    }

}
