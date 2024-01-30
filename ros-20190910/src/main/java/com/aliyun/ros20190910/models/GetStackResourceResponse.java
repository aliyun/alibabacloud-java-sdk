// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStackResourceResponseBody body;

    public static GetStackResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResourceResponse self = new GetStackResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetStackResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackResourceResponse setBody(GetStackResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackResourceResponseBody getBody() {
        return this.body;
    }

}
