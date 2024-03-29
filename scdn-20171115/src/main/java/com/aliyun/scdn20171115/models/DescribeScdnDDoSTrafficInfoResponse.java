// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDDoSTrafficInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDDoSTrafficInfoResponseBody body;

    public static DescribeScdnDDoSTrafficInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDDoSTrafficInfoResponse self = new DescribeScdnDDoSTrafficInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDDoSTrafficInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDDoSTrafficInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDDoSTrafficInfoResponse setBody(DescribeScdnDDoSTrafficInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDDoSTrafficInfoResponseBody getBody() {
        return this.body;
    }

}
