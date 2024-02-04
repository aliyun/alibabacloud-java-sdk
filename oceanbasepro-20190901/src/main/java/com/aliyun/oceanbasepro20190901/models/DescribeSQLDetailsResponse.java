// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLDetailsResponseBody body;

    public static DescribeSQLDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLDetailsResponse self = new DescribeSQLDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLDetailsResponse setBody(DescribeSQLDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLDetailsResponseBody getBody() {
        return this.body;
    }

}
