// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateSqlStatementRequest extends TeaModel {
    /**
     * <p>The content of the code that you want to verify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public SqlStatementWithContext body;

    public static ValidateSqlStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateSqlStatementRequest self = new ValidateSqlStatementRequest();
        return TeaModel.build(map, self);
    }

    public ValidateSqlStatementRequest setBody(SqlStatementWithContext body) {
        this.body = body;
        return this;
    }
    public SqlStatementWithContext getBody() {
        return this.body;
    }

}
