// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportDTXAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDTXAppConfigResponseBody body;

    public static ExportDTXAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDTXAppConfigResponse self = new ExportDTXAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public ExportDTXAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDTXAppConfigResponse setBody(ExportDTXAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDTXAppConfigResponseBody getBody() {
        return this.body;
    }

}
