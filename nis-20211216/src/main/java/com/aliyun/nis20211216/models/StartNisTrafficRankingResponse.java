// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisTrafficRankingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartNisTrafficRankingResponseBody body;

    public static StartNisTrafficRankingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartNisTrafficRankingResponse self = new StartNisTrafficRankingResponse();
        return TeaModel.build(map, self);
    }

    public StartNisTrafficRankingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartNisTrafficRankingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartNisTrafficRankingResponse setBody(StartNisTrafficRankingResponseBody body) {
        this.body = body;
        return this;
    }
    public StartNisTrafficRankingResponseBody getBody() {
        return this.body;
    }

}
