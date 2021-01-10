// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktRemovetemplatefromprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeLinktRemovetemplatefromprojectResponseBody body;

    public static CheckLinkeLinktRemovetemplatefromprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktRemovetemplatefromprojectResponse self = new CheckLinkeLinktRemovetemplatefromprojectResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponse setBody(CheckLinkeLinktRemovetemplatefromprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeLinktRemovetemplatefromprojectResponseBody getBody() {
        return this.body;
    }

}
