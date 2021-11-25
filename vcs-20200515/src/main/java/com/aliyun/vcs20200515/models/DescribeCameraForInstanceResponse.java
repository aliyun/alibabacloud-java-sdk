// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeCameraForInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCameraForInstanceResponseBody body;

    public static DescribeCameraForInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCameraForInstanceResponse self = new DescribeCameraForInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCameraForInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCameraForInstanceResponse setBody(DescribeCameraForInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCameraForInstanceResponseBody getBody() {
        return this.body;
    }

}
