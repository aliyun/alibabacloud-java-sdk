// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlStatementWithContext extends TeaModel {
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("batchMode")
    public Boolean batchMode;

    @NameInMap("catalog")
    public String catalog;

    @NameInMap("database")
    public String database;

    @NameInMap("flinkConfiguration")
    public java.util.Map<String, ?> flinkConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("statement")
    public String statement;

    @NameInMap("versionName")
    public String versionName;

    public static SqlStatementWithContext build(java.util.Map<String, ?> map) throws Exception {
        SqlStatementWithContext self = new SqlStatementWithContext();
        return TeaModel.build(map, self);
    }

    public SqlStatementWithContext setAdditionalDependencies(java.util.List<String> additionalDependencies) {
        this.additionalDependencies = additionalDependencies;
        return this;
    }
    public java.util.List<String> getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    public SqlStatementWithContext setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
        return this;
    }
    public Boolean getBatchMode() {
        return this.batchMode;
    }

    public SqlStatementWithContext setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public SqlStatementWithContext setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public SqlStatementWithContext setFlinkConfiguration(java.util.Map<String, ?> flinkConfiguration) {
        this.flinkConfiguration = flinkConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getFlinkConfiguration() {
        return this.flinkConfiguration;
    }

    public SqlStatementWithContext setStatement(String statement) {
        this.statement = statement;
        return this;
    }
    public String getStatement() {
        return this.statement;
    }

    public SqlStatementWithContext setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
