// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMSDdsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMSDdsJobResponseBody body;

    public static GetMSDdsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMSDdsJobResponse self = new GetMSDdsJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMSDdsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMSDdsJobResponse setBody(GetMSDdsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMSDdsJobResponseBody getBody() {
        return this.body;
    }

}
