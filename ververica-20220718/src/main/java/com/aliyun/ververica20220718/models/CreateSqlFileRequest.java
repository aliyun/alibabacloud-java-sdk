// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSqlFileRequest extends TeaModel {
    /**
     * <p>The request body, which contains the SQL file content and related metadata to be created.</p>
     */
    @NameInMap("body")
    public SqlFile body;

    public static CreateSqlFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlFileRequest self = new CreateSqlFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlFileRequest setBody(SqlFile body) {
        this.body = body;
        return this;
    }
    public SqlFile getBody() {
        return this.body;
    }

}
