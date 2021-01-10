// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportDmsMsgTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDmsMsgTypeResponseBody body;

    public static ExportDmsMsgTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDmsMsgTypeResponse self = new ExportDmsMsgTypeResponse();
        return TeaModel.build(map, self);
    }

    public ExportDmsMsgTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDmsMsgTypeResponse setBody(ExportDmsMsgTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDmsMsgTypeResponseBody getBody() {
        return this.body;
    }

}
