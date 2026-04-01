// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ActivateMigrationTargetInstanceResponseBody extends TeaModel {
    /**
     * <p>The name of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>76364A52-E0AB-5CC8-9818-CF1DC482C092</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The port number that is used to connect to the self-managed PostgreSQL instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The ID of the identification task.</p>
     * 
     * <strong>example:</strong>
     * <p>440913675</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ActivateMigrationTargetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateMigrationTargetInstanceResponseBody self = new ActivateMigrationTargetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateMigrationTargetInstanceResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ActivateMigrationTargetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivateMigrationTargetInstanceResponseBody setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public ActivateMigrationTargetInstanceResponseBody setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public ActivateMigrationTargetInstanceResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
