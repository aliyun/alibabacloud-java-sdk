// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPersonalStorageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPersonalStorageListResponseBody body;

    public static GetPersonalStorageListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalStorageListResponse self = new GetPersonalStorageListResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonalStorageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPersonalStorageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPersonalStorageListResponse setBody(GetPersonalStorageListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPersonalStorageListResponseBody getBody() {
        return this.body;
    }

}
