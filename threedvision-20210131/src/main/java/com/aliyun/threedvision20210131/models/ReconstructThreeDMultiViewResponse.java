// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructThreeDMultiViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReconstructThreeDMultiViewResponseBody body;

    public static ReconstructThreeDMultiViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ReconstructThreeDMultiViewResponse self = new ReconstructThreeDMultiViewResponse();
        return TeaModel.build(map, self);
    }

    public ReconstructThreeDMultiViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReconstructThreeDMultiViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReconstructThreeDMultiViewResponse setBody(ReconstructThreeDMultiViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ReconstructThreeDMultiViewResponseBody getBody() {
        return this.body;
    }

}
