// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetOSSStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOSSStatisResponseBody body;

    public static GetOSSStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSStatisResponse self = new GetOSSStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSStatisResponse setBody(GetOSSStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOSSStatisResponseBody getBody() {
        return this.body;
    }

}
