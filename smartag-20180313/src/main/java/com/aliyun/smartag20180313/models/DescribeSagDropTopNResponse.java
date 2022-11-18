// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagDropTopNResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagDropTopNResponseBody body;

    public static DescribeSagDropTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagDropTopNResponse self = new DescribeSagDropTopNResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagDropTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagDropTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagDropTopNResponse setBody(DescribeSagDropTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagDropTopNResponseBody getBody() {
        return this.body;
    }

}
