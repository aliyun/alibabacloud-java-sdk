// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadRevisionHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadRevisionHistoryListResponseBody body;

    public static ReadRevisionHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadRevisionHistoryListResponse self = new ReadRevisionHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public ReadRevisionHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadRevisionHistoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadRevisionHistoryListResponse setBody(ReadRevisionHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadRevisionHistoryListResponseBody getBody() {
        return this.body;
    }

}
