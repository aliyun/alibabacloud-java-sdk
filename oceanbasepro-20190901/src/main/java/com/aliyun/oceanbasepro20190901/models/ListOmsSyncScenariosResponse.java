// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsSyncScenariosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsSyncScenariosResponseBody body;

    public static ListOmsSyncScenariosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsSyncScenariosResponse self = new ListOmsSyncScenariosResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsSyncScenariosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsSyncScenariosResponse setBody(ListOmsSyncScenariosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsSyncScenariosResponseBody getBody() {
        return this.body;
    }

}
