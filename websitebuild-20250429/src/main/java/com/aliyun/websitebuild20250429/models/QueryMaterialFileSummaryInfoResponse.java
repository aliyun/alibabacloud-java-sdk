// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialFileSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMaterialFileSummaryInfoResponseBody body;

    public static QueryMaterialFileSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialFileSummaryInfoResponse self = new QueryMaterialFileSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaterialFileSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMaterialFileSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMaterialFileSummaryInfoResponse setBody(QueryMaterialFileSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMaterialFileSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
