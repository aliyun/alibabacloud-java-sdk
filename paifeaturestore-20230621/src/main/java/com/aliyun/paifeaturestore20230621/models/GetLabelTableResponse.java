// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetLabelTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLabelTableResponseBody body;

    public static GetLabelTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTableResponse self = new GetLabelTableResponse();
        return TeaModel.build(map, self);
    }

    public GetLabelTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabelTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLabelTableResponse setBody(GetLabelTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabelTableResponseBody getBody() {
        return this.body;
    }

}
