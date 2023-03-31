// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmVersionRequest extends TeaModel {
    @NameInMap("AlgorithmSpec")
    public AlgorithmSpec algorithmSpec;

    public static UpdateAlgorithmVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlgorithmVersionRequest self = new UpdateAlgorithmVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlgorithmVersionRequest setAlgorithmSpec(AlgorithmSpec algorithmSpec) {
        this.algorithmSpec = algorithmSpec;
        return this;
    }
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

}
