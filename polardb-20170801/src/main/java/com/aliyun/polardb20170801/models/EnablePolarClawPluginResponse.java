// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnablePolarClawPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnablePolarClawPluginResponseBody body;

    public static EnablePolarClawPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePolarClawPluginResponse self = new EnablePolarClawPluginResponse();
        return TeaModel.build(map, self);
    }

    public EnablePolarClawPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnablePolarClawPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnablePolarClawPluginResponse setBody(EnablePolarClawPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public EnablePolarClawPluginResponseBody getBody() {
        return this.body;
    }

}
