// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDailyPlayStatisResponseBody body;

    public static GetDailyPlayStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyPlayStatisResponse self = new GetDailyPlayStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyPlayStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDailyPlayStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDailyPlayStatisResponse setBody(GetDailyPlayStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDailyPlayStatisResponseBody getBody() {
        return this.body;
    }

}
