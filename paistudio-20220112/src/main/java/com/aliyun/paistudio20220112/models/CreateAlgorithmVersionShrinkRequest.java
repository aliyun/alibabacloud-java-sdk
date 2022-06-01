// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmVersionShrinkRequest extends TeaModel {
    @NameInMap("AlgorithmSpec")
    public String algorithmSpecShrink;

    public static CreateAlgorithmVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmVersionShrinkRequest self = new CreateAlgorithmVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmVersionShrinkRequest setAlgorithmSpecShrink(String algorithmSpecShrink) {
        this.algorithmSpecShrink = algorithmSpecShrink;
        return this;
    }
    public String getAlgorithmSpecShrink() {
        return this.algorithmSpecShrink;
    }

}
