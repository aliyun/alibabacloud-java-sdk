// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllDTXParticipatorActionNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllDTXParticipatorActionNamesResponseBody body;

    public static AllDTXParticipatorActionNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDTXParticipatorActionNamesResponse self = new AllDTXParticipatorActionNamesResponse();
        return TeaModel.build(map, self);
    }

    public AllDTXParticipatorActionNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllDTXParticipatorActionNamesResponse setBody(AllDTXParticipatorActionNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public AllDTXParticipatorActionNamesResponseBody getBody() {
        return this.body;
    }

}
