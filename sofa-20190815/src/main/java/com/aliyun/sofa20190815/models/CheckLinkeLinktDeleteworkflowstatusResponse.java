// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktDeleteworkflowstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeLinktDeleteworkflowstatusResponseBody body;

    public static CheckLinkeLinktDeleteworkflowstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktDeleteworkflowstatusResponse self = new CheckLinkeLinktDeleteworkflowstatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktDeleteworkflowstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponse setBody(CheckLinkeLinktDeleteworkflowstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeLinktDeleteworkflowstatusResponseBody getBody() {
        return this.body;
    }

}
