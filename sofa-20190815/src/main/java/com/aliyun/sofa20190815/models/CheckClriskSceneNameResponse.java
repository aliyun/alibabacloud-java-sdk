// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckClriskSceneNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckClriskSceneNameResponseBody body;

    public static CheckClriskSceneNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckClriskSceneNameResponse self = new CheckClriskSceneNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckClriskSceneNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckClriskSceneNameResponse setBody(CheckClriskSceneNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckClriskSceneNameResponseBody getBody() {
        return this.body;
    }

}
