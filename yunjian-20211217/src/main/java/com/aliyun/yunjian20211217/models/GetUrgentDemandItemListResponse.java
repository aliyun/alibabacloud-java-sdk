// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUrgentDemandItemListResponseBody body;

    public static GetUrgentDemandItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandItemListResponse self = new GetUrgentDemandItemListResponse();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUrgentDemandItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUrgentDemandItemListResponse setBody(GetUrgentDemandItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUrgentDemandItemListResponseBody getBody() {
        return this.body;
    }

}
