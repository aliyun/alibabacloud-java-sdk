// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateAlgorithmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>algo-sidjc8134hv</p>
     */
    @NameInMap("AlgorithmId")
    public String algorithmId;

    /**
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
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
