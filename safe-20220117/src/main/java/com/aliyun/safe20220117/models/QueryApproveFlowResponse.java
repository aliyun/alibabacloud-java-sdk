// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryApproveFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryApproveFlowResponseBody body;

    public static QueryApproveFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApproveFlowResponse self = new QueryApproveFlowResponse();
        return TeaModel.build(map, self);
    }

    public QueryApproveFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApproveFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryApproveFlowResponse setBody(QueryApproveFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApproveFlowResponseBody getBody() {
        return this.body;
    }

}
