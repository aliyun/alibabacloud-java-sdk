// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddClriskProductSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddClriskProductSceneResponseBody body;

    public static AddClriskProductSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClriskProductSceneResponse self = new AddClriskProductSceneResponse();
        return TeaModel.build(map, self);
    }

    public AddClriskProductSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClriskProductSceneResponse setBody(AddClriskProductSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClriskProductSceneResponseBody getBody() {
        return this.body;
    }

}
