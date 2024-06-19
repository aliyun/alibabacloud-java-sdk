// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AllocateInstancePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionRequest self = new AllocateInstancePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public AllocateInstancePublicConnectionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public AllocateInstancePublicConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateInstancePublicConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateInstancePublicConnectionRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AllocateInstancePublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateInstancePublicConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateInstancePublicConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
