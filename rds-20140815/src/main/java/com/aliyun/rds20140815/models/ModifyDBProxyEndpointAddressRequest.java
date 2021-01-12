// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    @NameInMap("DBProxyNewConnectString")
    public String DBProxyNewConnectString;

    @NameInMap("DBProxyNewConnectStringPort")
    public String DBProxyNewConnectStringPort;

    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    public static ModifyDBProxyEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointAddressRequest self = new ModifyDBProxyEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyEndpointAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyNewConnectString(String DBProxyNewConnectString) {
        this.DBProxyNewConnectString = DBProxyNewConnectString;
        return this;
    }
    public String getDBProxyNewConnectString() {
        return this.DBProxyNewConnectString;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyNewConnectStringPort(String DBProxyNewConnectStringPort) {
        this.DBProxyNewConnectStringPort = DBProxyNewConnectStringPort;
        return this;
    }
    public String getDBProxyNewConnectStringPort() {
        return this.DBProxyNewConnectStringPort;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

}
