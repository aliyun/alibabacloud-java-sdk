// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCustomerFlowByLocationRequest extends TeaModel {
    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("MinCount")
    public Long minCount;

    @NameInMap("ParentAmount")
    public Long parentAmount;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("ParentLocationIds")
    public String parentLocationIds;

    @NameInMap("LocationId")
    public Long locationId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("MaxCount")
    public Long maxCount;

    public static DescribeCustomerFlowByLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerFlowByLocationRequest self = new DescribeCustomerFlowByLocationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerFlowByLocationRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeCustomerFlowByLocationRequest setMinCount(Long minCount) {
        this.minCount = minCount;
        return this;
    }
    public Long getMinCount() {
        return this.minCount;
    }

    public DescribeCustomerFlowByLocationRequest setParentAmount(Long parentAmount) {
        this.parentAmount = parentAmount;
        return this;
    }
    public Long getParentAmount() {
        return this.parentAmount;
    }

    public DescribeCustomerFlowByLocationRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeCustomerFlowByLocationRequest setParentLocationIds(String parentLocationIds) {
        this.parentLocationIds = parentLocationIds;
        return this;
    }
    public String getParentLocationIds() {
        return this.parentLocationIds;
    }

    public DescribeCustomerFlowByLocationRequest setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }
    public Long getLocationId() {
        return this.locationId;
    }

    public DescribeCustomerFlowByLocationRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeCustomerFlowByLocationRequest setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Long getMaxCount() {
        return this.maxCount;
    }

}
