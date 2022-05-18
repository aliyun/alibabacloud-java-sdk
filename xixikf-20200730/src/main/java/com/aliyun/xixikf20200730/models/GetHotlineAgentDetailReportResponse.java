// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineAgentDetailReportResponseBody body;

    public static GetHotlineAgentDetailReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailReportResponse self = new GetHotlineAgentDetailReportResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineAgentDetailReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotlineAgentDetailReportResponse setBody(GetHotlineAgentDetailReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineAgentDetailReportResponseBody getBody() {
        return this.body;
    }

}
