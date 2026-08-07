// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListVoiceAccessProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoiceAccessProfilesResponseBody body;

    public static ListVoiceAccessProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAccessProfilesResponse self = new ListVoiceAccessProfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListVoiceAccessProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoiceAccessProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoiceAccessProfilesResponse setBody(ListVoiceAccessProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoiceAccessProfilesResponseBody getBody() {
        return this.body;
    }

}
