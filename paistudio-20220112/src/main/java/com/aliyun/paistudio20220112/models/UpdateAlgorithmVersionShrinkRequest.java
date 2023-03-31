// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmVersionShrinkRequest extends TeaModel {
    @NameInMap("AlgorithmSpec")
    public String algorithmSpecShrink;

    public static UpdateAlgorithmVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlgorithmVersionShrinkRequest self = new UpdateAlgorithmVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlgorithmVersionShrinkRequest setAlgorithmSpecShrink(String algorithmSpecShrink) {
        this.algorithmSpecShrink = algorithmSpecShrink;
        return this;
    }
    public String getAlgorithmSpecShrink() {
        return this.algorithmSpecShrink;
    }

}
