// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCDNStatisSumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCDNStatisSumResponseBody body;

    public static GetCDNStatisSumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisSumResponse self = new GetCDNStatisSumResponse();
        return TeaModel.build(map, self);
    }

    public GetCDNStatisSumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCDNStatisSumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCDNStatisSumResponse setBody(GetCDNStatisSumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCDNStatisSumResponseBody getBody() {
        return this.body;
    }

}
