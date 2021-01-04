// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp20180408.models;

import com.aliyun.tea.*;

public class IEResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static IEResponse build(java.util.Map<String, ?> map) throws Exception {
        IEResponse self = new IEResponse();
        return TeaModel.build(map, self);
    }

    public IEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
