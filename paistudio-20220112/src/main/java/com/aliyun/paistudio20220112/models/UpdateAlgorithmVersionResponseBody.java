// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmVersionResponseBody extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    public static UpdateAlgorithmVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlgorithmVersionResponseBody self = new UpdateAlgorithmVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlgorithmVersionResponseBody setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public UpdateAlgorithmVersionResponseBody setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
        return this;
    }
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

}
