// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTransitRouterFlowTopNResponseBody body;

    public static GetTransitRouterFlowTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransitRouterFlowTopNResponse self = new GetTransitRouterFlowTopNResponse();
        return TeaModel.build(map, self);
    }

    public GetTransitRouterFlowTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTransitRouterFlowTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTransitRouterFlowTopNResponse setBody(GetTransitRouterFlowTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTransitRouterFlowTopNResponseBody getBody() {
        return this.body;
    }

}
