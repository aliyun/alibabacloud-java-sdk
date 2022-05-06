// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    @NameInMap("ACL")
    public String ACL;

    @NameInMap("CAType")
    public String CAType;

    @NameInMap("ClientCACert")
    public String clientCACert;

    @NameInMap("ClientCAEnabled")
    public Integer clientCAEnabled;

    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    @NameInMap("ClientCrlEnabled")
    public Integer clientCrlEnabled;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReplicationACL")
    public String replicationACL;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    @NameInMap("ServerCert")
    public String serverCert;

    @NameInMap("ServerKey")
    public String serverKey;

    public static ModifyDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLRequest self = new ModifyDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLRequest setACL(String ACL) {
        this.ACL = ACL;
        return this;
    }
    public String getACL() {
        return this.ACL;
    }

    public ModifyDBInstanceSSLRequest setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public ModifyDBInstanceSSLRequest setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public ModifyDBInstanceSSLRequest setClientCAEnabled(Integer clientCAEnabled) {
        this.clientCAEnabled = clientCAEnabled;
        return this;
    }
    public Integer getClientCAEnabled() {
        return this.clientCAEnabled;
    }

    public ModifyDBInstanceSSLRequest setClientCertRevocationList(String clientCertRevocationList) {
        this.clientCertRevocationList = clientCertRevocationList;
        return this;
    }
    public String getClientCertRevocationList() {
        return this.clientCertRevocationList;
    }

    public ModifyDBInstanceSSLRequest setClientCrlEnabled(Integer clientCrlEnabled) {
        this.clientCrlEnabled = clientCrlEnabled;
        return this;
    }
    public Integer getClientCrlEnabled() {
        return this.clientCrlEnabled;
    }

    public ModifyDBInstanceSSLRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceSSLRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSSLRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSSLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSSLRequest setReplicationACL(String replicationACL) {
        this.replicationACL = replicationACL;
        return this;
    }
    public String getReplicationACL() {
        return this.replicationACL;
    }

    public ModifyDBInstanceSSLRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSSLRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceSSLRequest setSSLEnabled(Integer SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    public ModifyDBInstanceSSLRequest setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public ModifyDBInstanceSSLRequest setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

}
