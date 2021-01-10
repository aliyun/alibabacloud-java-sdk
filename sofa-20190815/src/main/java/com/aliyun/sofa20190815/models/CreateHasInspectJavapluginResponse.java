// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectJavapluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectJavapluginResponseBody body;

    public static CreateHasInspectJavapluginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectJavapluginResponse self = new CreateHasInspectJavapluginResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectJavapluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectJavapluginResponse setBody(CreateHasInspectJavapluginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectJavapluginResponseBody getBody() {
        return this.body;
    }

}
