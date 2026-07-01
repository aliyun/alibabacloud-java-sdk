// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartSqlExecutionResult extends TeaModel {
    /**
     * <p>Indicates whether the SQL execution is newly created.</p>
     */
    @NameInMap("newlyCreated")
    public Boolean newlyCreated;

    /**
     * <p>The SQL execution ID.</p>
     */
    @NameInMap("sqlExecutionId")
    public String sqlExecutionId;

    /**
     * <p>Indicates whether the SQL execution is successful.</p>
     */
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
