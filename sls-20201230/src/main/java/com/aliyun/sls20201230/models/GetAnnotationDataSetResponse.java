// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAnnotationDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MLDataSetParam body;

    public static GetAnnotationDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationDataSetResponse self = new GetAnnotationDataSetResponse();
        return TeaModel.build(map, self);
    }

    public GetAnnotationDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnnotationDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnnotationDataSetResponse setBody(MLDataSetParam body) {
        this.body = body;
        return this;
    }
    public MLDataSetParam getBody() {
        return this.body;
    }

}
