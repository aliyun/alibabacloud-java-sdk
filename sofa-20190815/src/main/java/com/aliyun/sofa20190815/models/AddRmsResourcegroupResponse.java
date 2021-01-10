// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsResourcegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRmsResourcegroupResponseBody body;

    public static AddRmsResourcegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRmsResourcegroupResponse self = new AddRmsResourcegroupResponse();
        return TeaModel.build(map, self);
    }

    public AddRmsResourcegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRmsResourcegroupResponse setBody(AddRmsResourcegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRmsResourcegroupResponseBody getBody() {
        return this.body;
    }

}
