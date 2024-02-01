// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToVbrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantInstanceToVbrResponseBody body;

    public static GrantInstanceToVbrResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToVbrResponse self = new GrantInstanceToVbrResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToVbrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantInstanceToVbrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantInstanceToVbrResponse setBody(GrantInstanceToVbrResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantInstanceToVbrResponseBody getBody() {
        return this.body;
    }

}
