// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListRdDefaultSyncListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRdDefaultSyncListResponseBody body;

    public static ListRdDefaultSyncListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRdDefaultSyncListResponse self = new ListRdDefaultSyncListResponse();
        return TeaModel.build(map, self);
    }

    public ListRdDefaultSyncListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRdDefaultSyncListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRdDefaultSyncListResponse setBody(ListRdDefaultSyncListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRdDefaultSyncListResponseBody getBody() {
        return this.body;
    }

}
