// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateContrastResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskTemplateContrastResponseBody body;

    public static GetClriskTemplateContrastResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateContrastResponse self = new GetClriskTemplateContrastResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateContrastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskTemplateContrastResponse setBody(GetClriskTemplateContrastResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskTemplateContrastResponseBody getBody() {
        return this.body;
    }

}
