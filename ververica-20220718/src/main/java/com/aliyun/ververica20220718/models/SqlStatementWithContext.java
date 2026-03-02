// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlStatementWithContext extends TeaModel {
    /**
     * <p>The additional dependencies.</p>
     */
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    /**
     * <p>Specifies whether the deployment is a batch deployment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("batchMode")
    public Boolean batchMode;

    /**
     * <p>The Realtime Compute for Apache Flink configuration.</p>
     */
    @NameInMap("flinkConfiguration")
    public java.util.Map<String, ?> flinkConfiguration;

    /**
     * <p>The code of the deployment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE TEMPORARY TABLE datagen_source (
     *     name VARCHAR,
     *     score BIGINT
     * ) WITH (
     *    \&quot;connector\&quot; = \&quot;datagen\&quot;
     * );
     * CREATE TEMPORARY TABLE print_table (
     *    name VARCHAR,
     *    score BIGINT
     * ) WITH (
     *   \&quot;connector\&quot;=\&quot;print\&quot;,
     *   \&quot;logger\&quot;=\&quot;true\&quot;
     * );</p>
     * <p>INSERT INTO print_table
     * select * from datagen_source;</p>
     */
    @NameInMap("statement")
    public String statement;

    /**
     * <p>The engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>vvr-8.0.6-flink-1.17</p>
     */
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
