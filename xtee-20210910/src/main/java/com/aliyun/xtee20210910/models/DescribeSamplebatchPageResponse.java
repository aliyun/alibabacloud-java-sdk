// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSamplebatchPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSamplebatchPageResponseBody body;

    public static DescribeSamplebatchPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSamplebatchPageResponse self = new DescribeSamplebatchPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSamplebatchPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSamplebatchPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSamplebatchPageResponse setBody(DescribeSamplebatchPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSamplebatchPageResponseBody getBody() {
        return this.body;
    }

}
