// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmDescription")
    public String algorithmDescription;

    public static UpdateAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlgorithmRequest self = new UpdateAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlgorithmRequest setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
        return this;
    }
    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

}
