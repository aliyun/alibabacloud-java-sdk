// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryAssetDetailByUUIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAssetDetailByUUIDResponseBody body;

    public static QueryAssetDetailByUUIDResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetDetailByUUIDResponse self = new QueryAssetDetailByUUIDResponse();
        return TeaModel.build(map, self);
    }

    public QueryAssetDetailByUUIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAssetDetailByUUIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAssetDetailByUUIDResponse setBody(QueryAssetDetailByUUIDResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAssetDetailByUUIDResponseBody getBody() {
        return this.body;
    }

}
