// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class WriteFeatureViewTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public WriteFeatureViewTableResponseBody body;

    public static WriteFeatureViewTableResponse build(java.util.Map<String, ?> map) throws Exception {
        WriteFeatureViewTableResponse self = new WriteFeatureViewTableResponse();
        return TeaModel.build(map, self);
    }

    public WriteFeatureViewTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WriteFeatureViewTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WriteFeatureViewTableResponse setBody(WriteFeatureViewTableResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteFeatureViewTableResponseBody getBody() {
        return this.body;
    }

}
