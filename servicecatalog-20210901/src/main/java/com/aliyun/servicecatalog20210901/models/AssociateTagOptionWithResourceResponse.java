// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociateTagOptionWithResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateTagOptionWithResourceResponseBody body;

    public static AssociateTagOptionWithResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateTagOptionWithResourceResponse self = new AssociateTagOptionWithResourceResponse();
        return TeaModel.build(map, self);
    }

    public AssociateTagOptionWithResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateTagOptionWithResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateTagOptionWithResourceResponse setBody(AssociateTagOptionWithResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateTagOptionWithResourceResponseBody getBody() {
        return this.body;
    }

}
