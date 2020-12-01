// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public UpdateAppSecurityGroupQuery query;

    public static UpdateAppSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSecurityGroupRequest self = new UpdateAppSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppSecurityGroupRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppSecurityGroupRequest setQuery(UpdateAppSecurityGroupQuery query) {
        this.query = query;
        return this;
    }
    public UpdateAppSecurityGroupQuery getQuery() {
        return this.query;
    }

}
