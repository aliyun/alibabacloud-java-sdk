// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesAsCsvRequest extends TeaModel {
    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     */
    @NameInMap("CachedAsync")
    public Boolean cachedAsync;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     */
    @NameInMap("ExportKey")
    public String exportKey;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~610399~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDBInstancesAsCsvRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesAsCsvRequest self = new DescribeDBInstancesAsCsvRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesAsCsvRequest setCachedAsync(Boolean cachedAsync) {
        this.cachedAsync = cachedAsync;
        return this;
    }
    public Boolean getCachedAsync() {
        return this.cachedAsync;
    }

    public DescribeDBInstancesAsCsvRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancesAsCsvRequest setExportKey(String exportKey) {
        this.exportKey = exportKey;
        return this;
    }
    public String getExportKey() {
        return this.exportKey;
    }

    public DescribeDBInstancesAsCsvRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesAsCsvRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesAsCsvRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesAsCsvRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesAsCsvRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
