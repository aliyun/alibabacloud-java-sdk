// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FFB1D4B4-B253-540A-9B3B-AA711C48A1B7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmResponseBody self = new DeleteAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
