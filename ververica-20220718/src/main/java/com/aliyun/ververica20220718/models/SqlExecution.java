// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlExecution extends TeaModel {
    @NameInMap("batchMode")
    public Boolean batchMode;

    @NameInMap("description")
    public String description;

    @NameInMap("message")
    public String message;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("sessionClusterName")
    public String sessionClusterName;

    @NameInMap("sqlExecutionId")
    public String sqlExecutionId;

    @NameInMap("sqlFileId")
    public String sqlFileId;

    @NameInMap("sqlScript")
    public String sqlScript;

    @NameInMap("state")
    public String state;

    @NameInMap("statements")
    public java.util.List<SqlStatement> statements;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static SqlExecution build(java.util.Map<String, ?> map) throws Exception {
        SqlExecution self = new SqlExecution();
        return TeaModel.build(map, self);
    }

    public SqlExecution setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
        return this;
    }
    public Boolean getBatchMode() {
        return this.batchMode;
    }

    public SqlExecution setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SqlExecution setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SqlExecution setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SqlExecution setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SqlExecution setSessionClusterName(String sessionClusterName) {
        this.sessionClusterName = sessionClusterName;
        return this;
    }
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    public SqlExecution setSqlExecutionId(String sqlExecutionId) {
        this.sqlExecutionId = sqlExecutionId;
        return this;
    }
    public String getSqlExecutionId() {
        return this.sqlExecutionId;
    }

    public SqlExecution setSqlFileId(String sqlFileId) {
        this.sqlFileId = sqlFileId;
        return this;
    }
    public String getSqlFileId() {
        return this.sqlFileId;
    }

    public SqlExecution setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }
    public String getSqlScript() {
        return this.sqlScript;
    }

    public SqlExecution setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SqlExecution setStatements(java.util.List<SqlStatement> statements) {
        this.statements = statements;
        return this;
    }
    public java.util.List<SqlStatement> getStatements() {
        return this.statements;
    }

    public SqlExecution setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
