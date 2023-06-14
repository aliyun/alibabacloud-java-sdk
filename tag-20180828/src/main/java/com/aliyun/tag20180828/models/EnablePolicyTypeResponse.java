// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class EnablePolicyTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnablePolicyTypeResponseBody body;

    public static EnablePolicyTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePolicyTypeResponse self = new EnablePolicyTypeResponse();
        return TeaModel.build(map, self);
    }

    public EnablePolicyTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnablePolicyTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnablePolicyTypeResponse setBody(EnablePolicyTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnablePolicyTypeResponseBody getBody() {
        return this.body;
    }

}
