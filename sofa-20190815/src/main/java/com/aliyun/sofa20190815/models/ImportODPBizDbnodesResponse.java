// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportODPBizDbnodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportODPBizDbnodesResponseBody body;

    public static ImportODPBizDbnodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportODPBizDbnodesResponse self = new ImportODPBizDbnodesResponse();
        return TeaModel.build(map, self);
    }

    public ImportODPBizDbnodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportODPBizDbnodesResponse setBody(ImportODPBizDbnodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportODPBizDbnodesResponseBody getBody() {
        return this.body;
    }

}
