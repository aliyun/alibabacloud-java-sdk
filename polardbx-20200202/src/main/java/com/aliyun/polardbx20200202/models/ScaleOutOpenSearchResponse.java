// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ScaleOutOpenSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleOutOpenSearchResponseBody body;

    public static ScaleOutOpenSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutOpenSearchResponse self = new ScaleOutOpenSearchResponse();
        return TeaModel.build(map, self);
    }

    public ScaleOutOpenSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleOutOpenSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleOutOpenSearchResponse setBody(ScaleOutOpenSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleOutOpenSearchResponseBody getBody() {
        return this.body;
    }

}
