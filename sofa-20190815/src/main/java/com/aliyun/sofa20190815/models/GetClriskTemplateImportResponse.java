// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateImportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskTemplateImportResponseBody body;

    public static GetClriskTemplateImportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateImportResponse self = new GetClriskTemplateImportResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskTemplateImportResponse setBody(GetClriskTemplateImportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskTemplateImportResponseBody getBody() {
        return this.body;
    }

}
