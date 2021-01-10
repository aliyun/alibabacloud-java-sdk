// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportDmsBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportDmsBindingResponseBody body;

    public static ImportDmsBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDmsBindingResponse self = new ImportDmsBindingResponse();
        return TeaModel.build(map, self);
    }

    public ImportDmsBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDmsBindingResponse setBody(ImportDmsBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDmsBindingResponseBody getBody() {
        return this.body;
    }

}
