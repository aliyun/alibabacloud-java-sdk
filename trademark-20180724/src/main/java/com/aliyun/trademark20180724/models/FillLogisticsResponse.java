// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class FillLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FillLogisticsResponseBody body;

    public static FillLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        FillLogisticsResponse self = new FillLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public FillLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FillLogisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FillLogisticsResponse setBody(FillLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public FillLogisticsResponseBody getBody() {
        return this.body;
    }

}
