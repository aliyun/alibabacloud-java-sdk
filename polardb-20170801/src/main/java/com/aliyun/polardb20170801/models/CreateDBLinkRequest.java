// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBLinkRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBLinkName")
    public String DBLinkName;

    @NameInMap("TargetDBInstanceName")
    public String targetDBInstanceName;

    @NameInMap("TargetDBAccount")
    public String targetDBAccount;

    @NameInMap("TargetDBPasswd")
    public String targetDBPasswd;

    @NameInMap("TargetDBName")
    public String targetDBName;

    @NameInMap("SourceDBName")
    public String sourceDBName;

    @NameInMap("TargetIp")
    public String targetIp;

    @NameInMap("TargetPort")
    public String targetPort;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDBLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBLinkRequest self = new CreateDBLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBLinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBLinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBLinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBLinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBLinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBLinkRequest setDBLinkName(String DBLinkName) {
        this.DBLinkName = DBLinkName;
        return this;
    }
    public String getDBLinkName() {
        return this.DBLinkName;
    }

    public CreateDBLinkRequest setTargetDBInstanceName(String targetDBInstanceName) {
        this.targetDBInstanceName = targetDBInstanceName;
        return this;
    }
    public String getTargetDBInstanceName() {
        return this.targetDBInstanceName;
    }

    public CreateDBLinkRequest setTargetDBAccount(String targetDBAccount) {
        this.targetDBAccount = targetDBAccount;
        return this;
    }
    public String getTargetDBAccount() {
        return this.targetDBAccount;
    }

    public CreateDBLinkRequest setTargetDBPasswd(String targetDBPasswd) {
        this.targetDBPasswd = targetDBPasswd;
        return this;
    }
    public String getTargetDBPasswd() {
        return this.targetDBPasswd;
    }

    public CreateDBLinkRequest setTargetDBName(String targetDBName) {
        this.targetDBName = targetDBName;
        return this;
    }
    public String getTargetDBName() {
        return this.targetDBName;
    }

    public CreateDBLinkRequest setSourceDBName(String sourceDBName) {
        this.sourceDBName = sourceDBName;
        return this;
    }
    public String getSourceDBName() {
        return this.sourceDBName;
    }

    public CreateDBLinkRequest setTargetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }
    public String getTargetIp() {
        return this.targetIp;
    }

    public CreateDBLinkRequest setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public CreateDBLinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBLinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
