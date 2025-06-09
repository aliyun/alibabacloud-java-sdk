// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ReCreateCloudResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReCreateCloudResourceResponseBody body;

    public static ReCreateCloudResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReCreateCloudResourceResponse self = new ReCreateCloudResourceResponse();
        return TeaModel.build(map, self);
    }

    public ReCreateCloudResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReCreateCloudResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReCreateCloudResourceResponse setBody(ReCreateCloudResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReCreateCloudResourceResponseBody getBody() {
        return this.body;
    }

}
