// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlExecutionFetchResult extends TeaModel {
    @NameInMap("dqlResult")
    public DqlResult dqlResult;

    @NameInMap("sqlExecution")
    public SqlExecution sqlExecution;

    public static SqlExecutionFetchResult build(java.util.Map<String, ?> map) throws Exception {
        SqlExecutionFetchResult self = new SqlExecutionFetchResult();
        return TeaModel.build(map, self);
    }

    public SqlExecutionFetchResult setDqlResult(DqlResult dqlResult) {
        this.dqlResult = dqlResult;
        return this;
    }
    public DqlResult getDqlResult() {
        return this.dqlResult;
    }

    public SqlExecutionFetchResult setSqlExecution(SqlExecution sqlExecution) {
        this.sqlExecution = sqlExecution;
        return this;
    }
    public SqlExecution getSqlExecution() {
        return this.sqlExecution;
    }

}
