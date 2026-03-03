// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListComponentTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ComponentTemplatePageResult body;

    public static ListComponentTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentTemplatesResponse self = new ListComponentTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComponentTemplatesResponse setBody(ComponentTemplatePageResult body) {
        this.body = body;
        return this;
    }
    public ComponentTemplatePageResult getBody() {
        return this.body;
    }

}
