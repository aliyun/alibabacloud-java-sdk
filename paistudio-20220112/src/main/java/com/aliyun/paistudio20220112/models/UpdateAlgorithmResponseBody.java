// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmResponseBody extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlgorithmResponseBody self = new UpdateAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlgorithmResponseBody setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public UpdateAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
