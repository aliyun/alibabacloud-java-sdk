// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktRemovestatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeLinktRemovestatusResponseBody body;

    public static CheckLinkeLinktRemovestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktRemovestatusResponse self = new CheckLinkeLinktRemovestatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktRemovestatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeLinktRemovestatusResponse setBody(CheckLinkeLinktRemovestatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeLinktRemovestatusResponseBody getBody() {
        return this.body;
    }

}
