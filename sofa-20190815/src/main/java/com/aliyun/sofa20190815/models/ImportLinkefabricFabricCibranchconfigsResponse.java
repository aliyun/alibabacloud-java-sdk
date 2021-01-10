// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportLinkefabricFabricCibranchconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportLinkefabricFabricCibranchconfigsResponseBody body;

    public static ImportLinkefabricFabricCibranchconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportLinkefabricFabricCibranchconfigsResponse self = new ImportLinkefabricFabricCibranchconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ImportLinkefabricFabricCibranchconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportLinkefabricFabricCibranchconfigsResponse setBody(ImportLinkefabricFabricCibranchconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportLinkefabricFabricCibranchconfigsResponseBody getBody() {
        return this.body;
    }

}
