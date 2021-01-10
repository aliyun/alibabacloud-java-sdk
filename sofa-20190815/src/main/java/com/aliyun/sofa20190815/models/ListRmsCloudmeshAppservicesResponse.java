// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListRmsCloudmeshAppservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRmsCloudmeshAppservicesResponseBody body;

    public static ListRmsCloudmeshAppservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRmsCloudmeshAppservicesResponse self = new ListRmsCloudmeshAppservicesResponse();
        return TeaModel.build(map, self);
    }

    public ListRmsCloudmeshAppservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRmsCloudmeshAppservicesResponse setBody(ListRmsCloudmeshAppservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRmsCloudmeshAppservicesResponseBody getBody() {
        return this.body;
    }

}
