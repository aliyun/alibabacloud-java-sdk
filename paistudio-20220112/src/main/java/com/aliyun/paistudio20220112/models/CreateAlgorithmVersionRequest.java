// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmVersionRequest extends TeaModel {
    @NameInMap("AlgorithmSpec")
    public AlgorithmSpec algorithmSpec;

    public static CreateAlgorithmVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmVersionRequest self = new CreateAlgorithmVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmVersionRequest setAlgorithmSpec(AlgorithmSpec algorithmSpec) {
        this.algorithmSpec = algorithmSpec;
        return this;
    }
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

}
