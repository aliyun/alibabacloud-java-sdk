// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindVbrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindVbrResponseBody body;

    public static UnbindVbrResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindVbrResponse self = new UnbindVbrResponse();
        return TeaModel.build(map, self);
    }

    public UnbindVbrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindVbrResponse setBody(UnbindVbrResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindVbrResponseBody getBody() {
        return this.body;
    }

}
