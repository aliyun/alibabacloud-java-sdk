// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    /**
     * <p>The time when the precheck task was complete.</p>
     * 
     * <strong>example:</strong>
     * <p>1657524396</p>
     */
    @NameInMap("CompletedTime")
    public Long completedTime;

    /**
     * <p>The time when the precheck task was started.</p>
     * 
     * <strong>example:</strong>
     * <p>1660448660</p>
     */
    @NameInMap("CreatedTime")
    public Long createdTime;

    /**
     * <p>The status of the precheck task. Valid values:</p>
     * <ul>
     * <li><strong>completed</strong>: complete</li>
     * <li><strong>created</strong>: started</li>
     * <li><strong>error</strong>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The precheck progress in percentage. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the precheck task. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>instanceId</strong>: the ID of the server that hosts the database</p>
     * </li>
     * <li><p><strong>checkTime</strong>: the precheck time</p>
     * </li>
     * <li><p><strong>sourceType</strong>: the database type</p>
     * </li>
     * <li><p><strong>results</strong>: the precheck item and result</p>
     * <ul>
     * <li><strong>item</strong>: the precheck item</li>
     * <li><strong>result</strong>: the precheck result</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The following section describes the precheck items:</p>
     * </blockquote>
     * <ul>
     * <li><p>MSSQL</p>
     * <ul>
     * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check</li>
     * <li><strong>SERVICE_CONNECTIVITY</strong>: control network connectivity check</li>
     * <li><strong>SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE</strong>: recovery mode check</li>
     * <li><strong>SQL_SERVER_DB_NOT_ONLINE</strong>: SQL Server database status check</li>
     * </ul>
     * </li>
     * <li><p>ORACLE</p>
     * <ul>
     * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check</li>
     * <li><strong>SERVICE_CONNECTIVITY</strong>: control network connectivity check</li>
     * <li><strong>ORACLE_INSTANCE_STATUS</strong>: Oracle instance status check</li>
     * <li><strong>ORACLE_DB_STATUS</strong>: Oracle database status check</li>
     * <li><strong>ARCHIVELOG</strong>: archive mode check</li>
     * </ul>
     * </li>
     * <li><p>MYSQL</p>
     * <ul>
     * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check</li>
     * <li><strong>SERVICE_CONNECTIVITY</strong>: control network connectivity check</li>
     * <li><strong>MYSQL_VERSION</strong>: Supports full backup version checking</li>
     * <li><strong>MYSQL_BINLOG</strong>: BINLOG check</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;instanceId&quot;: &quot;i-wz91if83t97xgtn2****&quot;,
     *         &quot;checkTime&quot;: 1671245753,
     *         &quot;sourceType&quot;: &quot;MSSQL&quot;,
     *         &quot;results&quot;:
     *         [
     *             {
     *                 &quot;item&quot;: &quot;OSS_INTERNAL_ENDPOINT_CONNECTIVITY&quot;,
     *                 &quot;result&quot;: &quot;PASSED&quot;
     *             },
     *             {
     *                 &quot;item&quot;: &quot;SERVICE_CONNECTIVITY&quot;,
     *                 &quot;result&quot;: &quot;PASSED&quot;
     *             },
     *             {
     *                 &quot;item&quot;: &quot;SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE&quot;,
     *                 &quot;result&quot;: &quot;WARNING&quot;
     *             },
     *             {
     *                 &quot;item&quot;: &quot;SQL_SERVER_DB_NOT_ONLINE&quot;,
     *                 &quot;result&quot;: &quot;PASSED&quot;
     *             }
     *         ]
     *     }
     * ]</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The time when the precheck task was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1671084106</p>
     */
    @NameInMap("UpdatedTime")
    public Long updatedTime;

    public static QueryPreCheckDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPreCheckDatabaseResponseBody self = new QueryPreCheckDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPreCheckDatabaseResponseBody setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
        return this;
    }
    public Long getCompletedTime() {
        return this.completedTime;
    }

    public QueryPreCheckDatabaseResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public QueryPreCheckDatabaseResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryPreCheckDatabaseResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public QueryPreCheckDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPreCheckDatabaseResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryPreCheckDatabaseResponseBody setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

}
