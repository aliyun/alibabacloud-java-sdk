// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateEstimateCostResponseBody body;

    public static GetTemplateEstimateCostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostResponse self = new GetTemplateEstimateCostResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateEstimateCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateEstimateCostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateEstimateCostResponse setBody(GetTemplateEstimateCostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateEstimateCostResponseBody getBody() {
        return this.body;
    }

}
