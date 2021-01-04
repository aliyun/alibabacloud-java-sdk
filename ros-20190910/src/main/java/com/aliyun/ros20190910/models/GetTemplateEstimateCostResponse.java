// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetTemplateEstimateCostResponse setBody(GetTemplateEstimateCostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateEstimateCostResponseBody getBody() {
        return this.body;
    }

}
