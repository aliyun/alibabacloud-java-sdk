// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteCloudResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudResourceResponseBody body;

    public static DeleteCloudResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudResourceResponse self = new DeleteCloudResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudResourceResponse setBody(DeleteCloudResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudResourceResponseBody getBody() {
        return this.body;
    }

}
