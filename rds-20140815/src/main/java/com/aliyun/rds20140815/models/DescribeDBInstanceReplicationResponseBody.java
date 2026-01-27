// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceReplicationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the native replication mods is enabled. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong></li>
     * <li><strong>OFF</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("ExternalReplication")
    public String externalReplication;

    @NameInMap("GtidExecuted")
    public String gtidExecuted;

    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("ImportStatus")
    public String importStatus;

    /**
     * <p>The replication latency. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplicationDelay")
    public String replicationDelay;

    /**
     * <p>The replication error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Got fatal error 1236 from master when reading data from binary log...</p>
     */
    @NameInMap("ReplicationErrorMessage")
    public String replicationErrorMessage;

    @NameInMap("ReplicationIp")
    public String replicationIp;

    @NameInMap("ReplicationPort")
    public String replicationPort;

    /**
     * <p>The source of the native replication.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.x.x</p>
     */
    @NameInMap("ReplicationSource")
    public String replicationSource;

    /**
     * <p>The current replication status. Valid values:</p>
     * <ul>
     * <li><strong>Running</strong></li>
     * <li><strong>Connecting</strong></li>
     * <li><strong>Stopped</strong></li>
     * <li><strong>Error</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running
     * Connecting
     * Stopped
     * Error</p>
     */
    @NameInMap("ReplicationState")
    public String replicationState;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceReplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceReplicationResponseBody self = new DescribeDBInstanceReplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceReplicationResponseBody setExternalReplication(String externalReplication) {
        this.externalReplication = externalReplication;
        return this;
    }
    public String getExternalReplication() {
        return this.externalReplication;
    }

    public DescribeDBInstanceReplicationResponseBody setGtidExecuted(String gtidExecuted) {
        this.gtidExecuted = gtidExecuted;
        return this;
    }
    public String getGtidExecuted() {
        return this.gtidExecuted;
    }

    public DescribeDBInstanceReplicationResponseBody setImportStatus(String importStatus) {
        this.importStatus = importStatus;
        return this;
    }
    public String getImportStatus() {
        return this.importStatus;
    }

    public DescribeDBInstanceReplicationResponseBody setReplicationDelay(String replicationDelay) {
        this.replicationDelay = replicationDelay;
        return this;
    }
    public String getReplicationDelay() {
        return this.replicationDelay;
    }

    public DescribeDBInstanceReplicationResponseBody setReplicationErrorMessage(String replicationErrorMessage) {
        this.replicationErrorMessage = replicationErrorMessage;
        return this;
    }
    public String getReplicationErrorMessage() {
        return this.replicationErrorMessage;
    }

    public DescribeDBInstanceReplicationResponseBody setReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
        return this;
    }
    public String getReplicationIp() {
        return this.replicationIp;
    }

    public DescribeDBInstanceReplicationResponseBody setReplicationPort(String replicationPort) {
        this.replicationPort = replicationPort;
        return this;
    }
    public String getReplicationPort() {
        return this.replicationPort;
    }

    public DescribeDBInstanceReplicationResponseBody setReplicationSource(String replicationSource) {
        this.replicationSource = replicationSource;
        return this;
    }
    public String getReplicationSource() {
        return this.replicationSource;
    }

    public DescribeDBInstanceReplicationResponseBody setReplicationState(String replicationState) {
        this.replicationState = replicationState;
        return this;
    }
    public String getReplicationState() {
        return this.replicationState;
    }

    public DescribeDBInstanceReplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
