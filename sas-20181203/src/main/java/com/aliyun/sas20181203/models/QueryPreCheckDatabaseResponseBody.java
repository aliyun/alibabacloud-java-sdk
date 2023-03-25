// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    /**
     * <p>The time when the precheck task was complete.</p>
     */
    @NameInMap("CompletedTime")
    public Long completedTime;

    /**
     * <p>The time when the precheck task was started.</p>
     */
    @NameInMap("CreatedTime")
    public Long createdTime;

    /**
     * <p>The status of the precheck task. Valid values:</p>
     * <br>
     * <p>*   **completed**: complete</p>
     * <p>*   **created**: started</p>
     * <p>*   **error**: failed</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The precheck progress in percentage. Valid values: 0 to 100.</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the precheck task. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **instanceId**: the ID of the server that hosts the database</p>
     * <br>
     * <p>*   **checkTime**: the precheck time</p>
     * <br>
     * <p>*   **sourceType**: the database type</p>
     * <br>
     * <p>*   **results**: the precheck item and result</p>
     * <br>
     * <p>    *   **item**: the precheck item</p>
     * <p>    *   **result**: the precheck result</p>
     * <br>
     * <p>> The following section describes the precheck items:</p>
     * <br>
     * <p>*   MSSQL</p>
     * <br>
     * <p>    *   **OSS_INTERNAL_ENDPOINT_CONNECTIVITY**: OSS connectivity check</p>
     * <p>    *   **SERVICE_CONNECTIVITY**: control network connectivity check</p>
     * <p>    *   **SQL_SERVER_DB_IN_SIMPLE_RECOVERY_MODE**: recovery mode check</p>
     * <p>    *   **SQL_SERVER_DB_NOT_ONLINE**: SQL Server database status check</p>
     * <br>
     * <p>*   ORACLE</p>
     * <br>
     * <p>    *   **OSS_INTERNAL_ENDPOINT_CONNECTIVITY**: OSS connectivity check</p>
     * <p>    *   **SERVICE_CONNECTIVITY**: control network connectivity check</p>
     * <p>    *   **ORACLE_INSTANCE_STATUS**: Oracle instance status check</p>
     * <p>    *   **ORACLE_DB_STATUS**: Oracle database status check</p>
     * <p>    *   **ARCHIVELOG**: archive mode check</p>
     * <br>
     * <p>*   MYSQL</p>
     * <br>
     * <p>    *   **OSS_INTERNAL_ENDPOINT_CONNECTIVITY**: OSS connectivity check</p>
     * <p>    *   **SERVICE_CONNECTIVITY**: control network connectivity check</p>
     * <p>    *   **MYSQL_VERSION**: Supports full backup version checking</p>
     * <p>    *   **MYSQL_BINLOG**: BINLOG check</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The time when the precheck task was last updated.</p>
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
