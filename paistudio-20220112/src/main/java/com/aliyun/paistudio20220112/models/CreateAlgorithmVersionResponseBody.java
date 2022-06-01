// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmVersionResponseBody extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    public static CreateAlgorithmVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmVersionResponseBody self = new CreateAlgorithmVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmVersionResponseBody setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateAlgorithmVersionResponseBody setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
        return this;
    }
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

}
