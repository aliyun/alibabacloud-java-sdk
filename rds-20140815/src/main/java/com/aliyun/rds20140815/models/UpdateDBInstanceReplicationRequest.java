// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceReplicationRequest extends TeaModel {
    /**
     * <p>复制通道名称，用于标识复制链路</p>
     * 
     * <strong>example:</strong>
     * <p>replication-channel-001</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>目标RDS实例ID，复制链路将在此实例上更新</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890abcdef</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>主数据库主机地址，支持IP或域名，仅在需要更新时提供</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("MasterHost")
    public String masterHost;

    /**
     * <p>主数据库密码，用于验证复制用户，需要提前经过Base64编码，仅在需要更新时提供</p>
     * 
     * <strong>example:</strong>
     * <p>U2VjdXJlUGFzczEyMyE=</p>
     */
    @NameInMap("MasterPassword")
    public String masterPassword;

    /**
     * <p>主数据库端口号，通常为3306（MySQL）或5432（PostgreSQL），仅在需要更新时提供</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("MasterPort")
    public Integer masterPort;

    /**
     * <p>主数据库用户名，用于建立复制连接，仅在需要更新时提供</p>
     * 
     * <strong>example:</strong>
     * <p>repl_user</p>
     */
    @NameInMap("MasterUser")
    public String masterUser;

    /**
     * <p>操作类型，指定对复制链路执行的操作</p>
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
     * <p>地域ID，表示RDS实例所在的地域</p>
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
