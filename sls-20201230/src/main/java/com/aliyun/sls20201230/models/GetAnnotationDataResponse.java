// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAnnotationDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MLDataParam body;

    public static GetAnnotationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationDataResponse self = new GetAnnotationDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAnnotationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnnotationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnnotationDataResponse setBody(MLDataParam body) {
        this.body = body;
        return this;
    }
    public MLDataParam getBody() {
        return this.body;
    }

}
