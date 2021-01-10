// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckRmsRulegroupNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRmsRulegroupNameResponseBody body;

    public static CheckRmsRulegroupNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRmsRulegroupNameResponse self = new CheckRmsRulegroupNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckRmsRulegroupNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRmsRulegroupNameResponse setBody(CheckRmsRulegroupNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRmsRulegroupNameResponseBody getBody() {
        return this.body;
    }

}
