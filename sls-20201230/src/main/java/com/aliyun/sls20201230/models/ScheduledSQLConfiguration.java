// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ScheduledSQLConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataFormat")
    public String dataFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("destEndpoint")
    public String destEndpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("destLogstore")
    public String destLogstore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("destProject")
    public String destProject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("destRoleArn")
    public String destRoleArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fromTimeExpr")
    public String fromTimeExpr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("maxRetries")
    public Long maxRetries;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("maxRunTimeInSeconds")
    public Long maxRunTimeInSeconds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourcePool")
    public String resourcePool;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("script")
    public String script;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sourceLogstore")
    public String sourceLogstore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sqlType")
    public String sqlType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("toTimeExpr")
    public String toTimeExpr;

    public static ScheduledSQLConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ScheduledSQLConfiguration self = new ScheduledSQLConfiguration();
        return TeaModel.build(map, self);
    }

    public ScheduledSQLConfiguration setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ScheduledSQLConfiguration setDestEndpoint(String destEndpoint) {
        this.destEndpoint = destEndpoint;
        return this;
    }
    public String getDestEndpoint() {
        return this.destEndpoint;
    }

    public ScheduledSQLConfiguration setDestLogstore(String destLogstore) {
        this.destLogstore = destLogstore;
        return this;
    }
    public String getDestLogstore() {
        return this.destLogstore;
    }

    public ScheduledSQLConfiguration setDestProject(String destProject) {
        this.destProject = destProject;
        return this;
    }
    public String getDestProject() {
        return this.destProject;
    }

    public ScheduledSQLConfiguration setDestRoleArn(String destRoleArn) {
        this.destRoleArn = destRoleArn;
        return this;
    }
    public String getDestRoleArn() {
        return this.destRoleArn;
    }

    public ScheduledSQLConfiguration setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public ScheduledSQLConfiguration setFromTimeExpr(String fromTimeExpr) {
        this.fromTimeExpr = fromTimeExpr;
        return this;
    }
    public String getFromTimeExpr() {
        return this.fromTimeExpr;
    }

    public ScheduledSQLConfiguration setMaxRetries(Long maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }
    public Long getMaxRetries() {
        return this.maxRetries;
    }

    public ScheduledSQLConfiguration setMaxRunTimeInSeconds(Long maxRunTimeInSeconds) {
        this.maxRunTimeInSeconds = maxRunTimeInSeconds;
        return this;
    }
    public Long getMaxRunTimeInSeconds() {
        return this.maxRunTimeInSeconds;
    }

    public ScheduledSQLConfiguration setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public ScheduledSQLConfiguration setResourcePool(String resourcePool) {
        this.resourcePool = resourcePool;
        return this;
    }
    public String getResourcePool() {
        return this.resourcePool;
    }

    public ScheduledSQLConfiguration setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ScheduledSQLConfiguration setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public ScheduledSQLConfiguration setSourceLogstore(String sourceLogstore) {
        this.sourceLogstore = sourceLogstore;
        return this;
    }
    public String getSourceLogstore() {
        return this.sourceLogstore;
    }

    public ScheduledSQLConfiguration setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public ScheduledSQLConfiguration setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public ScheduledSQLConfiguration setToTimeExpr(String toTimeExpr) {
        this.toTimeExpr = toTimeExpr;
        return this;
    }
    public String getToTimeExpr() {
        return this.toTimeExpr;
    }

}
