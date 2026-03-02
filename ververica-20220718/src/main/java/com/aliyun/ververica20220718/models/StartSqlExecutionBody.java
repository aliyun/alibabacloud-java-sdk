// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartSqlExecutionBody extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("sqlFileId")
    public String sqlFileId;

    @NameInMap("sqlScript")
    public String sqlScript;

    public static StartSqlExecutionBody build(java.util.Map<String, ?> map) throws Exception {
        StartSqlExecutionBody self = new StartSqlExecutionBody();
        return TeaModel.build(map, self);
    }

    public StartSqlExecutionBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartSqlExecutionBody setSqlFileId(String sqlFileId) {
        this.sqlFileId = sqlFileId;
        return this;
    }
    public String getSqlFileId() {
        return this.sqlFileId;
    }

    public StartSqlExecutionBody setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }
    public String getSqlScript() {
        return this.sqlScript;
    }

}
