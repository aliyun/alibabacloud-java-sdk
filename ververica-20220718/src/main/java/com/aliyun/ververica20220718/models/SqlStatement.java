// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlStatement extends TeaModel {
    /**
     * <p>The index of the SQL statement.</p>
     */
    @NameInMap("index")
    public Integer index;

    /**
     * <p>The message returned for the SQL statement.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The SQL script content.</p>
     */
    @NameInMap("sqlScript")
    public String sqlScript;

    /**
     * <p>The status of the SQL statement.</p>
     */
    @NameInMap("statusState")
    public String statusState;

    /**
     * <p>The type of the SQL statement.</p>
     */
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
