// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>algo-xsldfvu1334</p>
     */
    @NameInMap("AlgorithmId")
    public String algorithmId;

    /**
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmResponseBody self = new CreateAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmResponseBody setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public CreateAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
