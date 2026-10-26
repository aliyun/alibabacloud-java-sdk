// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBNodeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically pay for the order.
     * Valid values:</p>
     * <ol>
     * <li><p><strong>true</strong>: Automatic payment is enabled. Make sure that your account balance is sufficient.</p>
     * </li>
     * <li><p><strong>false</strong>: Only an order is generated and no payment is made.</p>
     * </li>
     * </ol>
     * <blockquote>
     * <p>Default value: true. If your payment method has an insufficient balance, you can set this parameter to false. In this case, an unpaid order is generated, and you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1k8s41l2o52****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new instance storage capacity. Unit: GB. For details, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The node information.</p>
     * <blockquote>
     * <p>This parameter applies to ApsaraDB RDS for MySQL Cluster Edition instances.</p>
     * </blockquote>
     */
    @NameInMap("DBNode")
    public String DBNodeShrink;

    /**
     * <p>Specifies whether to perform a precheck before the node modifications. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A precheck is performed, but the modifications are not applied. The precheck includes checks on request parameters, request format, service limits, and inventory.</li>
     * <li><strong>false</strong>: A normal request is sent, and the modifications are directly applied after the precheck is passed (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The effective period. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong> (default): The modifications immediately take effect.</li>
     * <li><strong>MaintainTime</strong>: The modifications take effect within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to asynchronously apply the modifications. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Only an order is generated, and the modifications are asynchronously applied (default).</li>
     * <li><strong>false</strong>: The modifications are synchronously applied after the precheck is passed.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: true. The modifications are asynchronously applied. If you set this parameter to false, the modifications are synchronously applied, and the API response time is relatively long.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
