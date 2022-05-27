// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetDiffCountLabelsetAndDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiffCountLabelsetAndDatasetResponseBody body;

    public static GetDiffCountLabelsetAndDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiffCountLabelsetAndDatasetResponse self = new GetDiffCountLabelsetAndDatasetResponse();
        return TeaModel.build(map, self);
    }

    public GetDiffCountLabelsetAndDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiffCountLabelsetAndDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiffCountLabelsetAndDatasetResponse setBody(GetDiffCountLabelsetAndDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiffCountLabelsetAndDatasetResponseBody getBody() {
        return this.body;
    }

}
