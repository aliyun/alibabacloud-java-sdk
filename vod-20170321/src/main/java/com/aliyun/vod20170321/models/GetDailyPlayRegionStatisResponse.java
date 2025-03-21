// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayRegionStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDailyPlayRegionStatisResponseBody body;

    public static GetDailyPlayRegionStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDailyPlayRegionStatisResponse self = new GetDailyPlayRegionStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetDailyPlayRegionStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDailyPlayRegionStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDailyPlayRegionStatisResponse setBody(GetDailyPlayRegionStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDailyPlayRegionStatisResponseBody getBody() {
        return this.body;
    }

}
