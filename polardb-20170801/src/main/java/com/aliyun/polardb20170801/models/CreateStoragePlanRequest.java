// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateStoragePlanRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the subscription duration for the storage plan. Valid values:</p>
     * <br>
     * <p>*   **Month**</p>
     * <p>*   **Year**</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The capacity of the storage plan. Unit: GB. Valid values: 50, 100, 200, 300, 500, 1000, 2000, 3000, 5000, 10000, 15000, 20000, 25000, 30000, 50000, 100000, and 200000</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    /**
     * <p>The type of the storage plan. Valid values:</p>
     * <br>
     * <p>*   **Mainland**: The storage plan is used inside the Chinese mainland.</p>
     * <p>*   **Overseas**: The storage plan is used outside the Chinese mainland.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The subscription duration of the storage plan.</p>
     * <br>
     * <p>*   If **Period** is set to **Month**, the value ranges from 1 to 9.</p>
     * <p>*   If **Period** is set to **Year**, the value can be 1, 2, 3, or 5.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    public static CreateStoragePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoragePlanRequest self = new CreateStoragePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoragePlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStoragePlanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateStoragePlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateStoragePlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateStoragePlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateStoragePlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateStoragePlanRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public CreateStoragePlanRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateStoragePlanRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

}
