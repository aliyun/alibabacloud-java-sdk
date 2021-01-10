// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportAKSClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportAKSClusterNodeResponseBody body;

    public static ImportAKSClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAKSClusterNodeResponse self = new ImportAKSClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public ImportAKSClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportAKSClusterNodeResponse setBody(ImportAKSClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportAKSClusterNodeResponseBody getBody() {
        return this.body;
    }

}
