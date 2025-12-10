// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B4F16666-FD54-5D9D-A362-53A4C66692DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Spec")
    public java.util.Map<String, ?> spec;

    public static GetAlgorithmDefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefResponseBody self = new GetAlgorithmDefResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlgorithmDefResponseBody setSpec(java.util.Map<String, ?> spec) {
        this.spec = spec;
        return this;
    }
    public java.util.Map<String, ?> getSpec() {
        return this.spec;
    }

}
