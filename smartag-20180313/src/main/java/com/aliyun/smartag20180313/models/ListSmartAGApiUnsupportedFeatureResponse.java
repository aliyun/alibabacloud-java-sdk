// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGApiUnsupportedFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmartAGApiUnsupportedFeatureResponseBody body;

    public static ListSmartAGApiUnsupportedFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGApiUnsupportedFeatureResponse self = new ListSmartAGApiUnsupportedFeatureResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartAGApiUnsupportedFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartAGApiUnsupportedFeatureResponse setBody(ListSmartAGApiUnsupportedFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartAGApiUnsupportedFeatureResponseBody getBody() {
        return this.body;
    }

}
