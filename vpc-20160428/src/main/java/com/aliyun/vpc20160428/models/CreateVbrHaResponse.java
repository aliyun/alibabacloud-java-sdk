// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVbrHaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVbrHaResponseBody body;

    public static CreateVbrHaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVbrHaResponse self = new CreateVbrHaResponse();
        return TeaModel.build(map, self);
    }

    public CreateVbrHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVbrHaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVbrHaResponse setBody(CreateVbrHaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVbrHaResponseBody getBody() {
        return this.body;
    }

}
