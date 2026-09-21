// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    /**
     * <p>The time when the pre-check was completed. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657524396</p>
     */
    @NameInMap("CompletedTime")
    public Long completedTime;

    /**
     * <p>The time when the pre-check started. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1660448660</p>
     */
    @NameInMap("CreatedTime")
    public Long createdTime;

    /**
     * <p>The status description of the pre-check task. Valid values:</p>
     * <ul>
     * <li><strong>completed</strong>: Completed.</li>
     * <li><strong>created</strong>: Started.</li>
     * <li><strong>error</strong>: Pre-check failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The progress of the pre-check task. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the pre-check node. The value is in JSON format. The character string contains the following KEY values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: The instance ID of the server where the database resides.</li>
     * <li><strong>checkTime</strong>: The pre-check time.</li>
     * <li><strong>sourceType</strong>: The database type.</li>
     * <li><strong>results</strong>: The pre-check items and results.<ul>
     * <li><strong>item</strong>: The pre-check item.</li>
     * <li><strong>result</strong>: The pre-check result.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Pre-check item description</p>
     * <ul>
     * <li>MSSQL<ul>
     * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check.	</li>
     * <li><strong>SERVICE_CONNECTIVITY</strong>: Control network connectivity check.</li>
     * <li><strong>SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE</strong>: Recovery mode check.</li>
     * <li><strong>SQL_SERVER_DB_NOT_ONLINE</strong>: SQL Server database status check.</li>
     * </ul>
     * </li>
     * <li>ORACLE<ul>
     * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check.	</li>
     * <li><strong>SERVICE_CONNECTIVITY</strong>: Control network connectivity check.</li>
     * <li><strong>ORACLE_INSTANCE_STATUS</strong>: Oracle instance status check.</li>
     * <li><strong>ORACLE_DB_STATUS</strong>: Oracle database status check.</li>
     * <li><strong>ARCHIVELOG</strong>: Archive mode check.</li>
     * </ul>
     * </li>
     * <li>MYSQL<ul>
     * <li><strong>OSS_INTERNAL_ENDPOINT_CONNECTIVITY</strong>: OSS connectivity check.	</li>
     * <li><strong>SERVICE_CONNECTIVITY</strong>: Control network connectivity check.</li>
     * <li><strong>MYSQL_VERSION</strong>: Version check for full backup support.</li>
     * <li><strong>MYSQL_BINLOG</strong>: BINLOG check.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
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
     * <p>The time when the pre-check was last updated. The value is a UNIX timestamp. Unit: seconds.</p>
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
