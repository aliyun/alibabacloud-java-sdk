// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateInstancesRequest extends TeaModel {
    /**
     * <p>The number of simple application servers that you want to create. Valid values: 1 to 20.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. This parameter is required only when you set `AutoRenew` to true. Unit: months. Valid values: 1, 3, 6, 12, 24, and 36.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The billing method of the simple application servers. Set the value to PrePaid, which indicates the subscription billing method.</p>
     * <br>
     * <p>Default value: PrePaid.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The size of the data disk that is attached to the server. Unit: GB. Valid values: 0 to 16380. The value must be an integral multiple of 20.</p>
     * <br>
     * <p>*   A value of 0 indicates that no data disk is attached.</p>
     * <p>*   If the disk included in the specified plan is a standard SSD, the data disk must be 20 GB or larger in size.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("DataDiskSize")
    public Long dataDiskSize;

    /**
     * <p>The image ID. You can call the [ListImages](~~189313~~) operation to query the available images in the specified region.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The subscription period of the servers. Unit: months. Valid values: 1, 3, 6, 12, 24, and 36.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The plan ID. You can call the [ListPlans](~~189314~~) operation to query all plans provided by Simple Application Server in the specified region.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The region ID of the simple application servers. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancesRequest self = new CreateInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstancesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstancesRequest setDataDiskSize(Long dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Long getDataDiskSize() {
        return this.dataDiskSize;
    }

    public CreateInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstancesRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public CreateInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
