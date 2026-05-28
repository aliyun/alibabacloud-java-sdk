// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ScheduledSQLConfiguration extends TeaModel {
    /**
     * <p>The data format. Valid values: log2log, log2metric, and metric2metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log2log</p>
     */
    @NameInMap("dataFormat")
    public String dataFormat;

    /**
     * <p>The endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-intranet.log.aliyuncs.com</p>
     */
    @NameInMap("destEndpoint")
    public String destEndpoint;

    /**
     * <p>The destination Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dest-logstore-demo</p>
     */
    @NameInMap("destLogstore")
    public String destLogstore;

    /**
     * <p>The destination project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-demo</p>
     */
    @NameInMap("destProject")
    public String destProject;

    /**
     * <p>The ARN of the RAM role that is assumed to write data to the destination Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/aliyunlogetlrole</p>
     */
    @NameInMap("destRoleArn")
    public String destRoleArn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forceComplete")
    public Boolean forceComplete;

    /**
     * <p>The start time. For more information, see <a href="https://help.aliyun.com/document_detail/286459.html">Process and store data from a Logstore to a Metricstore</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1712592000</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The start time of the SQL time window.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@m-1m</p>
     */
    @NameInMap("fromTimeExpr")
    public String fromTimeExpr;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("maxConcurrency")
    public Long maxConcurrency;

    /**
     * <p>The maximum number of SQL timeouts allowed. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxRetries")
    public Long maxRetries;

    /**
     * <p>The maximum timeout period of SQL analysis. Unit: seconds. Valid values: 60 to 1800.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("maxRunTimeInSeconds")
    public Long maxRunTimeInSeconds;

    /**
     * <p>The SQL configurations. For more information, see <a href="https://help.aliyun.com/document_detail/286459.html">Process and store data from a Logstore to a Metricstore</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   addLabels: &quot;{}&quot;,
     *   hashLabels: &quot;[]&quot;,
     *   labelKeys: &quot;[\&quot;your label1\&quot;,\&quot;your label2\&quot;]&quot;,
     *   metricKeys: &quot;[\&quot;your Indicator1\&quot;,\&quot;your Indicator2\&quot;]&quot;,
     *   metricName: &quot;&quot;,
     *   timeKey: &quot;&quot;
     * }</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The type of the resource pool. The value enhanced specifies an enhanced resource pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enhanced</p>
     */
    @NameInMap("resourcePool")
    public String resourcePool;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that is assigned to the Scheduled SQL job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/aliyunlogetlrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The query statement of the Scheduled SQL job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| select *</li>
     * </ul>
     */
    @NameInMap("script")
    public String script;

    /**
     * <p>The source Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source-logstore-demo</p>
     */
    @NameInMap("sourceLogstore")
    public String sourceLogstore;

    /**
     * <p>The type of the query statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>searchQuery</p>
     */
    @NameInMap("sqlType")
    public String sqlType;

    /**
     * <p>The end time. For more information, see <a href="https://help.aliyun.com/document_detail/286459.html">Process and store data from a Logstore to a Metricstore</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    /**
     * <p>The end time of the SQL time window.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@m</p>
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

    public ScheduledSQLConfiguration setForceComplete(Boolean forceComplete) {
        this.forceComplete = forceComplete;
        return this;
    }
    public Boolean getForceComplete() {
        return this.forceComplete;
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

    public ScheduledSQLConfiguration setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
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
