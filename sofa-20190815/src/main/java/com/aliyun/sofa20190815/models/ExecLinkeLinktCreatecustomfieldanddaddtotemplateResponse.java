// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody body;

    public static ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse self = new ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponse setBody(ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateResponseBody getBody() {
        return this.body;
    }

}
