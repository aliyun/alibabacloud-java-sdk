// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateSqlFileRequest extends TeaModel {
    /**
     * <p>The SQL script information to update.</p>
     */
    @NameInMap("body")
    public SqlFile body;

    public static UpdateSqlFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlFileRequest self = new UpdateSqlFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSqlFileRequest setBody(SqlFile body) {
        this.body = body;
        return this;
    }
    public SqlFile getBody() {
        return this.body;
    }

}
