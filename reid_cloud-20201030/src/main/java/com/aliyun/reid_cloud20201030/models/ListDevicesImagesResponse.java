// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListDevicesImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevicesImagesResponseBody body;

    public static ListDevicesImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesImagesResponse self = new ListDevicesImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListDevicesImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevicesImagesResponse setBody(ListDevicesImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevicesImagesResponseBody getBody() {
        return this.body;
    }

}
