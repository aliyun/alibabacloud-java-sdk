// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartSqlExecutionResult extends TeaModel {
    @NameInMap("newlyCreated")
    public Boolean newlyCreated;

    @NameInMap("sqlExecutionId")
    public String sqlExecutionId;

    @NameInMap("success")
    public Boolean success;

    public static StartSqlExecutionResult build(java.util.Map<String, ?> map) throws Exception {
        StartSqlExecutionResult self = new StartSqlExecutionResult();
        return TeaModel.build(map, self);
    }

    public StartSqlExecutionResult setNewlyCreated(Boolean newlyCreated) {
        this.newlyCreated = newlyCreated;
        return this;
    }
    public Boolean getNewlyCreated() {
        return this.newlyCreated;
    }

    public StartSqlExecutionResult setSqlExecutionId(String sqlExecutionId) {
        this.sqlExecutionId = sqlExecutionId;
        return this;
    }
    public String getSqlExecutionId() {
        return this.sqlExecutionId;
    }

    public StartSqlExecutionResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
