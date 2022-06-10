// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVbrHaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVbrHaResponseBody body;

    public static DeleteVbrHaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVbrHaResponse self = new DeleteVbrHaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVbrHaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVbrHaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVbrHaResponse setBody(DeleteVbrHaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVbrHaResponseBody getBody() {
        return this.body;
    }

}
