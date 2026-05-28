// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SubmitAsyncSqlRequest extends TeaModel {
    @NameInMap("body")
    public SubmitAsyncSqlParams body;

    public static SubmitAsyncSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncSqlRequest self = new SubmitAsyncSqlRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncSqlRequest setBody(SubmitAsyncSqlParams body) {
        this.body = body;
        return this;
    }
    public SubmitAsyncSqlParams getBody() {
        return this.body;
    }

}
