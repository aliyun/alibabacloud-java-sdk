// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDasInstanceConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable automatic storage expansion. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable**</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold in percentage based on which an automatic storage expansion is triggered. If the available storage reaches the threshold, ApsaraDB RDS increases the storage capacity of the instance. Valid values:</p>
     * <br>
     * <p>*   **10**</p>
     * <p>*   **20**</p>
     * <p>*   **30**</p>
     * <p>*   **40**</p>
     * <p>*   **50**</p>
     * <br>
     * <p>>  If you set the **StorageAutoScale** parameter to **Enable**, you must specify this parameter.</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The maximum storage capacity that is allowed by automatic storage expansion. The value of this parameter must be equal to or greater than the current storage capacity of the instance.</p>
     * <br>
     * <p>*   Valid value for instances with ESSDs: 32000. Unit: GB</p>
     * <p>*   Valid value for instances with standard SSDs: 6000. Unit: GB</p>
     * <br>
     * <p>    > If you set the **StorageAutoScale** parameter to **Enable**, you must specify this parameter.</p>
     */
    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    public static ModifyDasInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasInstanceConfigRequest self = new ModifyDasInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDasInstanceConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDasInstanceConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDasInstanceConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDasInstanceConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDasInstanceConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDasInstanceConfigRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public ModifyDasInstanceConfigRequest setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public ModifyDasInstanceConfigRequest setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

}
