// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskOdpsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskOdpsTemplateResponseBody body;

    public static GetClriskOdpsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskOdpsTemplateResponse self = new GetClriskOdpsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskOdpsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskOdpsTemplateResponse setBody(GetClriskOdpsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskOdpsTemplateResponseBody getBody() {
        return this.body;
    }

}
