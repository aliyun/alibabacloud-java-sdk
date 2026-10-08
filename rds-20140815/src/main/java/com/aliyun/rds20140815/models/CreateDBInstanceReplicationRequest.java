// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceReplicationRequest extends TeaModel {
    /**
     * <p>The name of the replication channel, which is used to identify the replication task.</p>
     * 
     * <strong>example:</strong>
     * <p>replication-channel-001</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890abcdef</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The address of the primary database host. IP addresses and domain names are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("MasterHost")
    public String masterHost;

    /**
     * <p>The password of the primary database, which is used to authenticate the replication user. The password must be Base64-encoded in advance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>U2VjdXJlUGFzczEyMyE=</p>
     */
    @NameInMap("MasterPassword")
    public String masterPassword;

    /**
     * <p>The port number of the primary database. The default port is 3306 for MySQL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("MasterPort")
    public Integer masterPort;

    /**
     * <p>The username of the primary database, which is used to establish the replication connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repl_user</p>
     */
    @NameInMap("MasterUser")
    public String masterUser;

    /**
     * <p>阿里云账号ID，用于指定资源的所有者</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDBInstanceReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceReplicationRequest self = new CreateDBInstanceReplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceReplicationRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateDBInstanceReplicationRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CreateDBInstanceReplicationRequest setMasterHost(String masterHost) {
        this.masterHost = masterHost;
        return this;
    }
    public String getMasterHost() {
        return this.masterHost;
    }

    public CreateDBInstanceReplicationRequest setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword;
        return this;
    }
    public String getMasterPassword() {
        return this.masterPassword;
    }

    public CreateDBInstanceReplicationRequest setMasterPort(Integer masterPort) {
        this.masterPort = masterPort;
        return this;
    }
    public Integer getMasterPort() {
        return this.masterPort;
    }

    public CreateDBInstanceReplicationRequest setMasterUser(String masterUser) {
        this.masterUser = masterUser;
        return this;
    }
    public String getMasterUser() {
        return this.masterUser;
    }

    public CreateDBInstanceReplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstanceReplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
