// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableAIDBClusterDatasetServiceRequest extends TeaModel {
    /**
     * <p>The instance ID of the PolarFS cold storage instance that you attach to the dataset management service. Instructions to invoke: Note: This parameter is actually required. If it is not provided, the API returns InvalidDBClusterId.Malformed (400). Instructions to invoke: Valid ID format description: specifies the accepted prefix families (such as pcs-xxx), separator conventions (hyphen character vs. underscore character), and the corresponding resource types.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-2ze26***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the database instance that you attach to the dataset management service.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze88***</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static EnableAIDBClusterDatasetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAIDBClusterDatasetServiceRequest self = new EnableAIDBClusterDatasetServiceRequest();
        return TeaModel.build(map, self);
    }

    public EnableAIDBClusterDatasetServiceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public EnableAIDBClusterDatasetServiceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableAIDBClusterDatasetServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableAIDBClusterDatasetServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableAIDBClusterDatasetServiceRequest setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public EnableAIDBClusterDatasetServiceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableAIDBClusterDatasetServiceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
