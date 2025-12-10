// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F082BD0D-21E1-5F9B-81A0-AB07485B03CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Specs")
    public java.util.List<java.util.Map<String, ?>> specs;

    public static GetAlgorithmDefsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefsResponseBody self = new GetAlgorithmDefsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlgorithmDefsResponseBody setSpecs(java.util.List<java.util.Map<String, ?>> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getSpecs() {
        return this.specs;
    }

}
