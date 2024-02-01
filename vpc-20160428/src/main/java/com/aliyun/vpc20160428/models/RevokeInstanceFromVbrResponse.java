// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RevokeInstanceFromVbrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeInstanceFromVbrResponse setBody(RevokeInstanceFromVbrResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromVbrResponseBody getBody() {
        return this.body;
    }

}
