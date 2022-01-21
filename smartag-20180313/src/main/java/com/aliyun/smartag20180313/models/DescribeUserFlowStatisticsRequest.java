// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserFlowStatisticsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("StatisticsDate")
    public String statisticsDate;

    @NameInMap("UserNames")
    public java.util.List<String> userNames;

    public static DescribeUserFlowStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowStatisticsRequest self = new DescribeUserFlowStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowStatisticsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeUserFlowStatisticsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserFlowStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserFlowStatisticsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeUserFlowStatisticsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUserFlowStatisticsRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeUserFlowStatisticsRequest setStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate;
        return this;
    }
    public String getStatisticsDate() {
        return this.statisticsDate;
    }

    public DescribeUserFlowStatisticsRequest setUserNames(java.util.List<String> userNames) {
        this.userNames = userNames;
        return this;
    }
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

}
