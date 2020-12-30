// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class EnablePcdnControlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnablePcdnControlRuleResponseBody body;

    public static EnablePcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePcdnControlRuleResponse self = new EnablePcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnablePcdnControlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnablePcdnControlRuleResponse setBody(EnablePcdnControlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnablePcdnControlRuleResponseBody getBody() {
        return this.body;
    }

}
