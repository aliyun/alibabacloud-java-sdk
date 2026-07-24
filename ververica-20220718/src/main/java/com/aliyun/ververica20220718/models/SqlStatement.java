// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlStatement extends TeaModel {
    @NameInMap("index")
    public Integer index;

    @NameInMap("message")
    public String message;

    @NameInMap("sqlScript")
    public String sqlScript;

    @NameInMap("statusState")
    public String statusState;

    @NameInMap("type")
    public String type;

    public static SqlStatement build(java.util.Map<String, ?> map) throws Exception {
        SqlStatement self = new SqlStatement();
        return TeaModel.build(map, self);
    }

    public SqlStatement setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public SqlStatement setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SqlStatement setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }
    public String getSqlScript() {
        return this.sqlScript;
    }

    public SqlStatement setStatusState(String statusState) {
        this.statusState = statusState;
        return this;
    }
    public String getStatusState() {
        return this.statusState;
    }

    public SqlStatement setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
