// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TransformDBInstancePayTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: Auto-renewal is enabled.</p>
     * <p>*   **false**: Auto-renewal is disabled.</p>
     * <br>
     * <p>> * This parameter is valid only when you change the billing method from pay-as-you-go to subscription.</p>
     * <p>> * All strings except **true** are considered **false**.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The extended business information of the instance.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the instance. Valid values:</p>
     * <br>
     * <p>*   **Year**: yearly subscription</p>
     * <p>*   **Month**: monthly subscription</p>
     * <br>
     * <p>>  This parameter must be specified if you set the **PayType** parameter to **Prepaid**.</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The subscription period of the instance. Valid values:</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the UsedTime parameter ranges from **1 to 5**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the UsedTime parameter ranges from **1 to 9**.</p>
     * <br>
     * <p>>  This parameter must be specified if you set the **PayType** parameter to **Prepaid**.</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static TransformDBInstancePayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformDBInstancePayTypeRequest self = new TransformDBInstancePayTypeRequest();
        return TeaModel.build(map, self);
    }

    public TransformDBInstancePayTypeRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public TransformDBInstancePayTypeRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public TransformDBInstancePayTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransformDBInstancePayTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public TransformDBInstancePayTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TransformDBInstancePayTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TransformDBInstancePayTypeRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public TransformDBInstancePayTypeRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public TransformDBInstancePayTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TransformDBInstancePayTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TransformDBInstancePayTypeRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
