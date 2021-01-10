// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse self = new QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse setBody(QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody getBody() {
        return this.body;
    }

}
