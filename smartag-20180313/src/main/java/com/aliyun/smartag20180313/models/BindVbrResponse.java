// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindVbrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindVbrResponseBody body;

    public static BindVbrResponse build(java.util.Map<String, ?> map) throws Exception {
        BindVbrResponse self = new BindVbrResponse();
        return TeaModel.build(map, self);
    }

    public BindVbrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindVbrResponse setBody(BindVbrResponseBody body) {
        this.body = body;
        return this;
    }
    public BindVbrResponseBody getBody() {
        return this.body;
    }

}
