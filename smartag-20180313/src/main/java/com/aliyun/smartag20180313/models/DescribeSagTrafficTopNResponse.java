// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagTrafficTopNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagTrafficTopNResponseBody body;

    public static DescribeSagTrafficTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagTrafficTopNResponse self = new DescribeSagTrafficTopNResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagTrafficTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagTrafficTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagTrafficTopNResponse setBody(DescribeSagTrafficTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagTrafficTopNResponseBody getBody() {
        return this.body;
    }

}
