// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeInstanceFromVbrResponseBody body;

    public static RevokeInstanceFromVbrResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromVbrResponse self = new RevokeInstanceFromVbrResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromVbrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceFromVbrResponse setBody(RevokeInstanceFromVbrResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromVbrResponseBody getBody() {
        return this.body;
    }

}
