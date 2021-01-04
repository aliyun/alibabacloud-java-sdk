// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToVbrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantSagInstanceToVbrResponseBody body;

    public static GrantSagInstanceToVbrResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToVbrResponse self = new GrantSagInstanceToVbrResponse();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToVbrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantSagInstanceToVbrResponse setBody(GrantSagInstanceToVbrResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantSagInstanceToVbrResponseBody getBody() {
        return this.body;
    }

}
