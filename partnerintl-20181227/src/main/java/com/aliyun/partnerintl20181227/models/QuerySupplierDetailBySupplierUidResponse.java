// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QuerySupplierDetailBySupplierUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySupplierDetailBySupplierUidResponseBody body;

    public static QuerySupplierDetailBySupplierUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierDetailBySupplierUidResponse self = new QuerySupplierDetailBySupplierUidResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupplierDetailBySupplierUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupplierDetailBySupplierUidResponse setBody(QuerySupplierDetailBySupplierUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupplierDetailBySupplierUidResponseBody getBody() {
        return this.body;
    }

}
