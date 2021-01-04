// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp20180408.models;

import com.aliyun.tea.*;

public class KWEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static KWEResponse build(java.util.Map<String, ?> map) throws Exception {
        KWEResponse self = new KWEResponse();
        return TeaModel.build(map, self);
    }

    public KWEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
