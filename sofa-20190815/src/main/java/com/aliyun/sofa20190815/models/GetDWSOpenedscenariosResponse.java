// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSOpenedscenariosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSOpenedscenariosResponseBody body;

    public static GetDWSOpenedscenariosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSOpenedscenariosResponse self = new GetDWSOpenedscenariosResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSOpenedscenariosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSOpenedscenariosResponse setBody(GetDWSOpenedscenariosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSOpenedscenariosResponseBody getBody() {
        return this.body;
    }

}
