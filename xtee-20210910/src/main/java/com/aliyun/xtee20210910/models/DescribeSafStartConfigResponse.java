// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafStartConfigResponseBody body;

    public static DescribeSafStartConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafStartConfigResponse self = new DescribeSafStartConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafStartConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafStartConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafStartConfigResponse setBody(DescribeSafStartConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafStartConfigResponseBody getBody() {
        return this.body;
    }

}
