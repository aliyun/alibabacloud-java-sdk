// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnablePolarClawChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnablePolarClawChannelResponseBody body;

    public static EnablePolarClawChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePolarClawChannelResponse self = new EnablePolarClawChannelResponse();
        return TeaModel.build(map, self);
    }

    public EnablePolarClawChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnablePolarClawChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnablePolarClawChannelResponse setBody(EnablePolarClawChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public EnablePolarClawChannelResponseBody getBody() {
        return this.body;
    }

}
