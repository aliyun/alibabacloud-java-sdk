// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartSqlExecutionRequest extends TeaModel {
    /**
     * <p>The request body, which contains the SQL content to execute and description information.</p>
     */
    @NameInMap("body")
    public StartSqlExecutionBody body;

    public static StartSqlExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSqlExecutionRequest self = new StartSqlExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartSqlExecutionRequest setBody(StartSqlExecutionBody body) {
        this.body = body;
        return this;
    }
    public StartSqlExecutionBody getBody() {
        return this.body;
    }

}
