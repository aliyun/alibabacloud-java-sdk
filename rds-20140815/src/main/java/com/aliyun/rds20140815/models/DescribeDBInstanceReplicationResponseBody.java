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

    /**
     * <p>The executed global transaction identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>bd2a34b9-8b8d-11ef-8917-00163e1298b9:1-20567</p>
     */
    @NameInMap("GtidExecuted")
    public String gtidExecuted;

    /**
     * <p>Indicates whether full data has been successfully imported.</p>
     * 
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

    /**
     * <p>The replication IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.x</p>
     */
    @NameInMap("ReplicationIp")
    public String replicationIp;

    /**
     * <p>The replication port.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("ReplicationPort")
    public String replicationPort;

    /**
     * <p>The source of the native replication.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
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
     * <p>Stopped</p>
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

    /**
     * <strong>example:</strong>
     * <p>[{&quot;SlaveIoRunning&quot;: &quot;Yes&quot;, &quot;SlaveSqlRunning&quot;: &quot;Yes&quot;, &quot;SecondsBehindMaster&quot;: 0, &quot;SlaveIoState&quot;: &quot;Waiting for master to send event&quot;, &quot;SlaveSqlRunningState&quot;: &quot;Slave has read all relay log; waiting for more updates&quot;, &quot;ExecutedGtidSet&quot;: &quot;bd2a34b9-8b8d-11ef-8917-00163e1298b9:1-20567&quot;, &quot;MasterHost&quot;: &quot;192.168.10.100&quot;, &quot;MasterUser&quot;: &quot;repl_user&quot;, &quot;MasterUuid&quot;: &quot;bd2a34b9-8b8d-11ef-8917-00163e1298b9&quot;, &quot;LastErrno&quot;: 0, &quot;LastSqlErrno&quot;: 0, &quot;LastIoErrno&quot;: 0, &quot;LastSqlError&quot;: &quot;&quot;, &quot;LastIoError&quot;: &quot;&quot;, &quot;ChannelName&quot;: &quot;my_test_channel&quot;, &quot;ReplicateDoDb&quot;: &quot;test_db,test_db_1&quot;, &quot;ReplicateIgnoreDb&quot;: &quot;information_schema,performance_schema&quot;, &quot;ReplicateDoTable&quot;: &quot;test_table,test_table_1&quot;, &quot;ReplicateIgnoreTable&quot;: &quot;temp_table,temp_table_1&quot;, &quot;ReplicateWildDoTable&quot;: &quot;test_table.%&quot;, &quot;ReplicateWildIgnoreTable&quot;: &quot;temp_table.%&quot;}]</p>
     */
    @NameInMap("SlaveStatusList")
    public java.util.List<DescribeDBInstanceReplicationResponseBodySlaveStatusList> slaveStatusList;

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

    public DescribeDBInstanceReplicationResponseBody setSlaveStatusList(java.util.List<DescribeDBInstanceReplicationResponseBodySlaveStatusList> slaveStatusList) {
        this.slaveStatusList = slaveStatusList;
        return this;
    }
    public java.util.List<DescribeDBInstanceReplicationResponseBodySlaveStatusList> getSlaveStatusList() {
        return this.slaveStatusList;
    }

    public static class DescribeDBInstanceReplicationResponseBodySlaveStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my_test_channel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>bd2a34b9-8b8d-11ef-8917-00163e1298b9:1-20567</p>
         */
        @NameInMap("ExecutedGtidSet")
        public String executedGtidSet;

        /**
         * <p>0表示无错误，其他值表示具体的错误代码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastErrno")
        public Integer lastErrno;

        /**
         * <p>0表示无错误，其他值表示IO线程的错误代码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastIoErrno")
        public Integer lastIoErrno;

        /**
         * <p>IO线程的错误信息描述</p>
         */
        @NameInMap("LastIoError")
        public String lastIoError;

        /**
         * <p>0表示无错误，其他值表示SQL线程的错误代码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastSqlErrno")
        public Integer lastSqlErrno;

        /**
         * <p>SQL线程的错误信息描述</p>
         */
        @NameInMap("LastSqlError")
        public String lastSqlError;

        /**
         * <strong>example:</strong>
         * <p>192.168.10.100</p>
         */
        @NameInMap("MasterHost")
        public String masterHost;

        /**
         * <strong>example:</strong>
         * <p>repl_user</p>
         */
        @NameInMap("MasterUser")
        public String masterUser;

        /**
         * <strong>example:</strong>
         * <p>bd2a34b9-8b8d-11ef-8917-00163e1298b9</p>
         */
        @NameInMap("MasterUuid")
        public String masterUuid;

        /**
         * <strong>example:</strong>
         * <p>test_db,test_db_1</p>
         */
        @NameInMap("ReplicateDoDb")
        public String replicateDoDb;

        /**
         * <strong>example:</strong>
         * <p>test_table,test_table_1</p>
         */
        @NameInMap("ReplicateDoTable")
        public String replicateDoTable;

        /**
         * <strong>example:</strong>
         * <p>information_schema,performance_schema</p>
         */
        @NameInMap("ReplicateIgnoreDb")
        public String replicateIgnoreDb;

        /**
         * <strong>example:</strong>
         * <p>temp_table,temp_table_1</p>
         */
        @NameInMap("ReplicateIgnoreTable")
        public String replicateIgnoreTable;

        /**
         * <strong>example:</strong>
         * <p>test_table.%</p>
         */
        @NameInMap("ReplicateWildDoTable")
        public String replicateWildDoTable;

        /**
         * <strong>example:</strong>
         * <p>temp_table.%</p>
         */
        @NameInMap("ReplicateWildIgnoreTable")
        public String replicateWildIgnoreTable;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecondsBehindMaster")
        public Integer secondsBehindMaster;

        /**
         * <p>Yes: 运行中，No: 已停止</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("SlaveIoRunning")
        public String slaveIoRunning;

        /**
         * <strong>example:</strong>
         * <p>Waiting for master to send event</p>
         */
        @NameInMap("SlaveIoState")
        public String slaveIoState;

        /**
         * <p>Yes: 运行中，No: 已停止</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("SlaveSqlRunning")
        public String slaveSqlRunning;

        /**
         * <strong>example:</strong>
         * <p>Slave has read all relay log; waiting for more updates</p>
         */
        @NameInMap("SlaveSqlRunningState")
        public String slaveSqlRunningState;

        public static DescribeDBInstanceReplicationResponseBodySlaveStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceReplicationResponseBodySlaveStatusList self = new DescribeDBInstanceReplicationResponseBodySlaveStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setExecutedGtidSet(String executedGtidSet) {
            this.executedGtidSet = executedGtidSet;
            return this;
        }
        public String getExecutedGtidSet() {
            return this.executedGtidSet;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setLastErrno(Integer lastErrno) {
            this.lastErrno = lastErrno;
            return this;
        }
        public Integer getLastErrno() {
            return this.lastErrno;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setLastIoErrno(Integer lastIoErrno) {
            this.lastIoErrno = lastIoErrno;
            return this;
        }
        public Integer getLastIoErrno() {
            return this.lastIoErrno;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setLastIoError(String lastIoError) {
            this.lastIoError = lastIoError;
            return this;
        }
        public String getLastIoError() {
            return this.lastIoError;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setLastSqlErrno(Integer lastSqlErrno) {
            this.lastSqlErrno = lastSqlErrno;
            return this;
        }
        public Integer getLastSqlErrno() {
            return this.lastSqlErrno;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setLastSqlError(String lastSqlError) {
            this.lastSqlError = lastSqlError;
            return this;
        }
        public String getLastSqlError() {
            return this.lastSqlError;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setMasterHost(String masterHost) {
            this.masterHost = masterHost;
            return this;
        }
        public String getMasterHost() {
            return this.masterHost;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setMasterUser(String masterUser) {
            this.masterUser = masterUser;
            return this;
        }
        public String getMasterUser() {
            return this.masterUser;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setMasterUuid(String masterUuid) {
            this.masterUuid = masterUuid;
            return this;
        }
        public String getMasterUuid() {
            return this.masterUuid;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setReplicateDoDb(String replicateDoDb) {
            this.replicateDoDb = replicateDoDb;
            return this;
        }
        public String getReplicateDoDb() {
            return this.replicateDoDb;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setReplicateDoTable(String replicateDoTable) {
            this.replicateDoTable = replicateDoTable;
            return this;
        }
        public String getReplicateDoTable() {
            return this.replicateDoTable;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setReplicateIgnoreDb(String replicateIgnoreDb) {
            this.replicateIgnoreDb = replicateIgnoreDb;
            return this;
        }
        public String getReplicateIgnoreDb() {
            return this.replicateIgnoreDb;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setReplicateIgnoreTable(String replicateIgnoreTable) {
            this.replicateIgnoreTable = replicateIgnoreTable;
            return this;
        }
        public String getReplicateIgnoreTable() {
            return this.replicateIgnoreTable;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setReplicateWildDoTable(String replicateWildDoTable) {
            this.replicateWildDoTable = replicateWildDoTable;
            return this;
        }
        public String getReplicateWildDoTable() {
            return this.replicateWildDoTable;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setReplicateWildIgnoreTable(String replicateWildIgnoreTable) {
            this.replicateWildIgnoreTable = replicateWildIgnoreTable;
            return this;
        }
        public String getReplicateWildIgnoreTable() {
            return this.replicateWildIgnoreTable;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setSecondsBehindMaster(Integer secondsBehindMaster) {
            this.secondsBehindMaster = secondsBehindMaster;
            return this;
        }
        public Integer getSecondsBehindMaster() {
            return this.secondsBehindMaster;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setSlaveIoRunning(String slaveIoRunning) {
            this.slaveIoRunning = slaveIoRunning;
            return this;
        }
        public String getSlaveIoRunning() {
            return this.slaveIoRunning;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setSlaveIoState(String slaveIoState) {
            this.slaveIoState = slaveIoState;
            return this;
        }
        public String getSlaveIoState() {
            return this.slaveIoState;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setSlaveSqlRunning(String slaveSqlRunning) {
            this.slaveSqlRunning = slaveSqlRunning;
            return this;
        }
        public String getSlaveSqlRunning() {
            return this.slaveSqlRunning;
        }

        public DescribeDBInstanceReplicationResponseBodySlaveStatusList setSlaveSqlRunningState(String slaveSqlRunningState) {
            this.slaveSqlRunningState = slaveSqlRunningState;
            return this;
        }
        public String getSlaveSqlRunningState() {
            return this.slaveSqlRunningState;
        }

    }

}
