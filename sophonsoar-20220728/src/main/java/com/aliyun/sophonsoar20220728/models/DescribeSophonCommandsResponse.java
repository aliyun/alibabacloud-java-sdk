// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSophonCommandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSophonCommandsResponseBody body;

    public static DescribeSophonCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSophonCommandsResponse self = new DescribeSophonCommandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSophonCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSophonCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSophonCommandsResponse setBody(DescribeSophonCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSophonCommandsResponseBody getBody() {
        return this.body;
    }

}
