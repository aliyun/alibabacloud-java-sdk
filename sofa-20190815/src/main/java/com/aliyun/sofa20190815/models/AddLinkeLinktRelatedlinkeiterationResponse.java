// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktRelatedlinkeiterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinktRelatedlinkeiterationResponseBody body;

    public static AddLinkeLinktRelatedlinkeiterationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktRelatedlinkeiterationResponse self = new AddLinkeLinktRelatedlinkeiterationResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktRelatedlinkeiterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinktRelatedlinkeiterationResponse setBody(AddLinkeLinktRelatedlinkeiterationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinktRelatedlinkeiterationResponseBody getBody() {
        return this.body;
    }

}
