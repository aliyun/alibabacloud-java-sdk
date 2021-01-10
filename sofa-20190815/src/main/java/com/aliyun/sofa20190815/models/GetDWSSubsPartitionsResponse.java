// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsPartitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsPartitionsResponseBody body;

    public static GetDWSSubsPartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsPartitionsResponse self = new GetDWSSubsPartitionsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsPartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsPartitionsResponse setBody(GetDWSSubsPartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsPartitionsResponseBody getBody() {
        return this.body;
    }

}
