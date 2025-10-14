// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateStoragePoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-bjxxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>node6</p>
     */
    @NameInMap("StoragePoolDNList")
    public String storagePoolDNList;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StoragePoolName")
    public String storagePoolName;

    public static CreateStoragePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoragePoolRequest self = new CreateStoragePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoragePoolRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateStoragePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStoragePoolRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateStoragePoolRequest setStoragePoolDNList(String storagePoolDNList) {
        this.storagePoolDNList = storagePoolDNList;
        return this;
    }
    public String getStoragePoolDNList() {
        return this.storagePoolDNList;
    }

    public CreateStoragePoolRequest setStoragePoolName(String storagePoolName) {
        this.storagePoolName = storagePoolName;
        return this;
    }
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

}
