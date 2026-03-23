// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceReplicationRequest extends TeaModel {
    /**
     * <p>The name of the replication channel, used to identify the replication channel.</p>
     * 
     * <strong>example:</strong>
     * <p>replication-channel-001</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890abcdef</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The host address of the master database, which can be an IP address or a domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("MasterHost")
    public String masterHost;

    /**
     * <p>The password of the master database, used to authenticate the replication user. It must be Base64-encoded in advance.</p>
     * 
     * <strong>example:</strong>
     * <p>U2VjdXJlUGFzczEyMyE=</p>
     */
    @NameInMap("MasterPassword")
    public String masterPassword;

    /**
     * <p>The port number of the master database, typically 3306 for MySQL.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("MasterPort")
    public Integer masterPort;

    /**
     * <p>The username of the master database, used to establish the replication connection. Provide this only when an update is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repl_user</p>
     */
    @NameInMap("MasterUser")
    public String masterUser;

    /**
     * <p>The Operation Type, specifying the operation to perform on the replication channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Start</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>阿里云账号ID，用于指定资源的所有者</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateDBInstanceReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceReplicationRequest self = new UpdateDBInstanceReplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceReplicationRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateDBInstanceReplicationRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public UpdateDBInstanceReplicationRequest setMasterHost(String masterHost) {
        this.masterHost = masterHost;
        return this;
    }
    public String getMasterHost() {
        return this.masterHost;
    }

    public UpdateDBInstanceReplicationRequest setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword;
        return this;
    }
    public String getMasterPassword() {
        return this.masterPassword;
    }

    public UpdateDBInstanceReplicationRequest setMasterPort(Integer masterPort) {
        this.masterPort = masterPort;
        return this;
    }
    public Integer getMasterPort() {
        return this.masterPort;
    }

    public UpdateDBInstanceReplicationRequest setMasterUser(String masterUser) {
        this.masterUser = masterUser;
        return this;
    }
    public String getMasterUser() {
        return this.masterUser;
    }

    public UpdateDBInstanceReplicationRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateDBInstanceReplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDBInstanceReplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
