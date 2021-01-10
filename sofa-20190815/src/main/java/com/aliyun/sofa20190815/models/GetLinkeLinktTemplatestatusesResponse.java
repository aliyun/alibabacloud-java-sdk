// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktTemplatestatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktTemplatestatusesResponseBody body;

    public static GetLinkeLinktTemplatestatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktTemplatestatusesResponse self = new GetLinkeLinktTemplatestatusesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktTemplatestatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktTemplatestatusesResponse setBody(GetLinkeLinktTemplatestatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktTemplatestatusesResponseBody getBody() {
        return this.body;
    }

}
