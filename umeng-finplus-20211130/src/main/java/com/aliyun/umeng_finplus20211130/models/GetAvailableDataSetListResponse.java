// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetAvailableDataSetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvailableDataSetListResponseBody body;

    public static GetAvailableDataSetListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableDataSetListResponse self = new GetAvailableDataSetListResponse();
        return TeaModel.build(map, self);
    }

    public GetAvailableDataSetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvailableDataSetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvailableDataSetListResponse setBody(GetAvailableDataSetListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvailableDataSetListResponseBody getBody() {
        return this.body;
    }

}
