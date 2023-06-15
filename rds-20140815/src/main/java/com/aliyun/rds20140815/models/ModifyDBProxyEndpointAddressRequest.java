// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <br>
     * <p>*   **Public**: Internet</p>
     * <p>*   **VPC**: virtual private cloud (VPC)</p>
     * <p>*   **Classic**: classic network</p>
     * <br>
     * <p>If the instance runs MySQL, the default value of this parameter is **Classic**.</p>
     * <br>
     * <p>> If the instance runs PostgreSQL, you must set this parameter to **Public** or **VPC**.</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The ID of the proxy endpoint. You can call the [DescribeDBProxyEndpoint](~~140955~~) operation to query the ID of the proxy endpoint.</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The new prefix of the proxy endpoint. Enter a prefix.</p>
     * <br>
     * <p>> You must specify at least one of the **DBProxyNewConnectString** and **DBProxyNewConnectStringPort** parameters.</p>
     */
    @NameInMap("DBProxyNewConnectString")
    public String DBProxyNewConnectString;

    /**
     * <p>The port number that is associated with the proxy endpoint. Enter a port number.</p>
     * <br>
     * <p>> You must specify at least one of the **DBProxyNewConnectString** and **DBProxyNewConnectStringPort** parameters.</p>
     */
    @NameInMap("DBProxyNewConnectStringPort")
    public String DBProxyNewConnectStringPort;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBProxyEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointAddressRequest self = new ModifyDBProxyEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public ModifyDBProxyEndpointAddressRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
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

}
