// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportDmsBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDmsBindingResponseBody body;

    public static ExportDmsBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDmsBindingResponse self = new ExportDmsBindingResponse();
        return TeaModel.build(map, self);
    }

    public ExportDmsBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDmsBindingResponse setBody(ExportDmsBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDmsBindingResponseBody getBody() {
        return this.body;
    }

}
