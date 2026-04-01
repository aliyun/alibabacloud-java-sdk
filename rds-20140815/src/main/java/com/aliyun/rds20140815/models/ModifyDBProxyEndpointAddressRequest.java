// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the database proxy endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong></li>
     * <li><strong>VPC</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> If the RDS instance runs MySQL, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The ID of the database proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID of the database proxy endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta9um4****</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The prefix of the new database proxy endpoint. A custom value is supported.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>DBProxyNewConnectString</strong> and <strong>DBProxyNewConnectStringPort</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test123456</p>
     */
    @NameInMap("DBProxyNewConnectString")
    public String DBProxyNewConnectString;

    /**
     * <p>The port number that is associated with the database proxy endpoint. A custom value is supported.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>DBProxyNewConnectString</strong> and <strong>DBProxyNewConnectStringPort</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3307</p>
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
