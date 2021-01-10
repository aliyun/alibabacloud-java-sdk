// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDmsBindingTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDmsBindingTemplateResponseBody body;

    public static GetDmsBindingTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDmsBindingTemplateResponse self = new GetDmsBindingTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDmsBindingTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDmsBindingTemplateResponse setBody(GetDmsBindingTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDmsBindingTemplateResponseBody getBody() {
        return this.body;
    }

}
