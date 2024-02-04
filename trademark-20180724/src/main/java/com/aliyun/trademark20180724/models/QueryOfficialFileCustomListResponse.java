// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOfficialFileCustomListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOfficialFileCustomListResponseBody body;

    public static QueryOfficialFileCustomListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOfficialFileCustomListResponse self = new QueryOfficialFileCustomListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOfficialFileCustomListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOfficialFileCustomListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOfficialFileCustomListResponse setBody(QueryOfficialFileCustomListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOfficialFileCustomListResponseBody getBody() {
        return this.body;
    }

}
