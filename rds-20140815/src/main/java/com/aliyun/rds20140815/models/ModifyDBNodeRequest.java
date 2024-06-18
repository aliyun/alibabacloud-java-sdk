// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <ol>
     * <li><strong>true</strong>: automatically completes the payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
     * </ol>
     * <blockquote>
     * <p> The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to pay for the order.</p>
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
     * <p>The new storage capacity of the instance. Unit: GB For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd</strong>: performance level 1 (PL1) enhanced SSD (ESSD)</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The information about the node.</p>
     * <blockquote>
     * <p> This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.</p>
     * </blockquote>
     */
    @NameInMap("DBNode")
    public java.util.List<ModifyDBNodeRequestDBNode> DBNode;

    /**
     * <p>Specifies whether to perform a dry run. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not perform the actual request. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Effective time, value:</p>
     * <ul>
     * <li>Immediate (default value): takes effect immediately.</li>
     * <li>MaintainTime: Effective within the operational time period, please refer to ModifyDBInstanceMaintainTime.</li>
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
     * <p>Specifies whether to asynchronously perform the operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): sends only the order. The operation is asynchronously performed.</li>
     * <li><strong>false</strong>: sends the request. After the request passes the check, the operation is directly performed.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is true, which indicates that the change operation is asynchronously performed. If you set this parameter to false, the change operation is simultaneously performed. This prolongs the response time of the operation.</p>
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

    public static ModifyDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeRequest self = new ModifyDBNodeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDBNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBNodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBNodeRequest setDBInstanceStorage(String DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public ModifyDBNodeRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public ModifyDBNodeRequest setDBNode(java.util.List<ModifyDBNodeRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<ModifyDBNodeRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public ModifyDBNodeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDBNodeRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBNodeRequest setProduceAsync(Boolean produceAsync) {
        this.produceAsync = produceAsync;
        return this;
    }
    public Boolean getProduceAsync() {
        return this.produceAsync;
    }

    public ModifyDBNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyDBNodeRequestDBNode extends TeaModel {
        /**
         * <p>The instance type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.medium.xc</p>
         */
        @NameInMap("classCode")
        public String classCode;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rn-6256r4a87xvv7he5p</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        public static ModifyDBNodeRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBNodeRequestDBNode self = new ModifyDBNodeRequestDBNode();
            return TeaModel.build(map, self);
        }

        public ModifyDBNodeRequestDBNode setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public ModifyDBNodeRequestDBNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
