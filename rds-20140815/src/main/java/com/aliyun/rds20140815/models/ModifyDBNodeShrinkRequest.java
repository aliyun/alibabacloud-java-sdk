// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBNodeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>1.  **true**: automatically completes the payment. Make sure that your account balance is sufficient.</p>
     * <p>2.  **false**: does not automatically complete the payment. An unpaid order is generated.</p>
     * <br>
     * <p>>  The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to pay for the order.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new storage capacity of the instance. Unit: GB For more information, see [Instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **cloud_essd**: performance level 1 (PL1) enhanced SSD (ESSD)</p>
     * <p>*   **cloud_essd2**: PL2 ESSD</p>
     * <p>*   **cloud_essd3**: PL3 ESSD</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The information about the node.</p>
     * <br>
     * <p>>  This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.</p>
     */
    @NameInMap("DBNode")
    public String DBNodeShrink;

    /**
     * <p>Specifies whether to perform a dry run. Valid values: Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run and does not perform the actual request. The system checks items such as the request parameters, request format, service limits, and available resources.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to asynchronously perform the operation. Valid values:</p>
     * <br>
     * <p>*   **true** (default): sends only the order. The operation is asynchronously performed.</p>
     * <p>*   **false**: sends the request. After the request passes the check, the operation is directly performed.</p>
     * <br>
     * <p>>  The default value is true, which indicates that the change operation is asynchronously performed. If you set this parameter to false, the change operation is simultaneously performed. This prolongs the response time of the operation.</p>
     */
    @NameInMap("ProduceAsync")
    public Boolean produceAsync;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeShrinkRequest self = new ModifyDBNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDBNodeShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBNodeShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBNodeShrinkRequest setDBInstanceStorage(String DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public ModifyDBNodeShrinkRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public ModifyDBNodeShrinkRequest setDBNodeShrink(String DBNodeShrink) {
        this.DBNodeShrink = DBNodeShrink;
        return this;
    }
    public String getDBNodeShrink() {
        return this.DBNodeShrink;
    }

    public ModifyDBNodeShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDBNodeShrinkRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBNodeShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBNodeShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBNodeShrinkRequest setProduceAsync(Boolean produceAsync) {
        this.produceAsync = produceAsync;
        return this;
    }
    public Boolean getProduceAsync() {
        return this.produceAsync;
    }

    public ModifyDBNodeShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBNodeShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
