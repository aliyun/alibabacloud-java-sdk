// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetOSSFlowStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOSSFlowStatisResponseBody body;

    public static GetOSSFlowStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSFlowStatisResponse self = new GetOSSFlowStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSFlowStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSFlowStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSFlowStatisResponse setBody(GetOSSFlowStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOSSFlowStatisResponseBody getBody() {
        return this.body;
    }

}
