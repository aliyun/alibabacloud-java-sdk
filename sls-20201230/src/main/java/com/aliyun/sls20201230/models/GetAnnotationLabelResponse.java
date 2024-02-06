// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAnnotationLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MLLabelParam body;

    public static GetAnnotationLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationLabelResponse self = new GetAnnotationLabelResponse();
        return TeaModel.build(map, self);
    }

    public GetAnnotationLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnnotationLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnnotationLabelResponse setBody(MLLabelParam body) {
        this.body = body;
        return this;
    }
    public MLLabelParam getBody() {
        return this.body;
    }

}
