// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportDmsMsgTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportDmsMsgTypeResponseBody body;

    public static ImportDmsMsgTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDmsMsgTypeResponse self = new ImportDmsMsgTypeResponse();
        return TeaModel.build(map, self);
    }

    public ImportDmsMsgTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDmsMsgTypeResponse setBody(ImportDmsMsgTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDmsMsgTypeResponseBody getBody() {
        return this.body;
    }

}
