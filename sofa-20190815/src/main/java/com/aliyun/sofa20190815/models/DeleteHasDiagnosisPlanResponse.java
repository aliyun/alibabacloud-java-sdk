// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasDiagnosisPlanResponseBody body;

    public static DeleteHasDiagnosisPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisPlanResponse self = new DeleteHasDiagnosisPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasDiagnosisPlanResponse setBody(DeleteHasDiagnosisPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasDiagnosisPlanResponseBody getBody() {
        return this.body;
    }

}
