// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutFlagcabinetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeBahamutFlagcabinetResponseBody body;

    public static SaveLinkeBahamutFlagcabinetResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutFlagcabinetResponse self = new SaveLinkeBahamutFlagcabinetResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutFlagcabinetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeBahamutFlagcabinetResponse setBody(SaveLinkeBahamutFlagcabinetResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeBahamutFlagcabinetResponseBody getBody() {
        return this.body;
    }

}
