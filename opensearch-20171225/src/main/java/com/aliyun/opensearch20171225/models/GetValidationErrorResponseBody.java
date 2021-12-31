// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetValidationErrorResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static GetValidationErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidationErrorResponseBody self = new GetValidationErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidationErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetValidationErrorResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
