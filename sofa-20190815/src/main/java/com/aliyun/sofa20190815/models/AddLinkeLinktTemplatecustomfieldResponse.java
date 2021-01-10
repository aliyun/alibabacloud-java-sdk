// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktTemplatecustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinktTemplatecustomfieldResponseBody body;

    public static AddLinkeLinktTemplatecustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktTemplatecustomfieldResponse self = new AddLinkeLinktTemplatecustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktTemplatecustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinktTemplatecustomfieldResponse setBody(AddLinkeLinktTemplatecustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinktTemplatecustomfieldResponseBody getBody() {
        return this.body;
    }

}
