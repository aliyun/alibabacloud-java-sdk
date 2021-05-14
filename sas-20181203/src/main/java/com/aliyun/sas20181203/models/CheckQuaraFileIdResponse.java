// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckQuaraFileIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckQuaraFileIdResponseBody body;

    public static CheckQuaraFileIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckQuaraFileIdResponse self = new CheckQuaraFileIdResponse();
        return TeaModel.build(map, self);
    }

    public CheckQuaraFileIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckQuaraFileIdResponse setBody(CheckQuaraFileIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckQuaraFileIdResponseBody getBody() {
        return this.body;
    }

}
