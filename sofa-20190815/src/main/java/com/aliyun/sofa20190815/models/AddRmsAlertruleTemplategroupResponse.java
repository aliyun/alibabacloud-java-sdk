// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsAlertruleTemplategroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRmsAlertruleTemplategroupResponseBody body;

    public static AddRmsAlertruleTemplategroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRmsAlertruleTemplategroupResponse self = new AddRmsAlertruleTemplategroupResponse();
        return TeaModel.build(map, self);
    }

    public AddRmsAlertruleTemplategroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRmsAlertruleTemplategroupResponse setBody(AddRmsAlertruleTemplategroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRmsAlertruleTemplategroupResponseBody getBody() {
        return this.body;
    }

}
