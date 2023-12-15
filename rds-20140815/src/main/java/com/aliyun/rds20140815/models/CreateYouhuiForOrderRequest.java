// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateYouhuiForOrderRequest extends TeaModel {
    /**
     * <p>The activity ID.</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The promotion ID. You can call the GetResourcePrice operation to query the promotion ID.</p>
     */
    @NameInMap("PromotionId")
    public Long promotionId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static CreateYouhuiForOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYouhuiForOrderRequest self = new CreateYouhuiForOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateYouhuiForOrderRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public CreateYouhuiForOrderRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateYouhuiForOrderRequest setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public Long getPromotionId() {
        return this.promotionId;
    }

    public CreateYouhuiForOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateYouhuiForOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateYouhuiForOrderRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
