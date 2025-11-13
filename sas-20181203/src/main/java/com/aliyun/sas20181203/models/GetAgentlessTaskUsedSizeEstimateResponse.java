// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskUsedSizeEstimateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentlessTaskUsedSizeEstimateResponseBody body;

    public static GetAgentlessTaskUsedSizeEstimateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskUsedSizeEstimateResponse self = new GetAgentlessTaskUsedSizeEstimateResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskUsedSizeEstimateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentlessTaskUsedSizeEstimateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentlessTaskUsedSizeEstimateResponse setBody(GetAgentlessTaskUsedSizeEstimateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentlessTaskUsedSizeEstimateResponseBody getBody() {
        return this.body;
    }

}
