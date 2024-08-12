// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ExecuteSqlStatementRequest extends TeaModel {
    @NameInMap("body")
    public SqlStatementWithContext body;

    public static ExecuteSqlStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlStatementRequest self = new ExecuteSqlStatementRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlStatementRequest setBody(SqlStatementWithContext body) {
        this.body = body;
        return this;
    }
    public SqlStatementWithContext getBody() {
        return this.body;
    }

}
