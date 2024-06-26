// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDasInstanceConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
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
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold in percentage based on which an automatic storage expansion is triggered. If the available storage reaches the threshold, ApsaraDB RDS increases the storage capacity of the instance. Valid values:</p>
     * <ul>
     * <li><strong>10</strong></li>
     * <li><strong>20</strong></li>
     * <li><strong>30</strong></li>
     * <li><strong>40</strong></li>
     * <li><strong>50</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set the StorageAutoScale parameter to <strong>Enable</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The maximum storage capacity that is allowed for an automatic storage expansion. The value of this parameter must be greater than or equal to the current storage capacity of the RDS instance.</p>
     * <ul>
     * <li>If the RDS instance uses ESSDs, the maximum value of this parameter can be set to 32000 GB.</li>
     * <li>If the RDS instance uses standard SSDs, the maximum value of this parameter can be set to 6000 GB.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>StorageAutoScale</strong> parameter to <strong>Enable</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
