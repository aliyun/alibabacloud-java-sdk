// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCustomerFlowByLocationResponseBody extends TeaModel {
    @NameInMap("CustomerFlowItems")
    public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems customerFlowItems;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Percent")
    public Float percent;

    @NameInMap("ParentLocationIds")
    public String parentLocationIds;

    @NameInMap("LocationId")
    public Long locationId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Count")
    public Long count;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("LocationName")
    public String locationName;

    public static DescribeCustomerFlowByLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerFlowByLocationResponseBody self = new DescribeCustomerFlowByLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerFlowByLocationResponseBody setCustomerFlowItems(DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems customerFlowItems) {
        this.customerFlowItems = customerFlowItems;
        return this;
    }
    public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems getCustomerFlowItems() {
        return this.customerFlowItems;
    }

    public DescribeCustomerFlowByLocationResponseBody setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeCustomerFlowByLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerFlowByLocationResponseBody setPercent(Float percent) {
        this.percent = percent;
        return this;
    }
    public Float getPercent() {
        return this.percent;
    }

    public DescribeCustomerFlowByLocationResponseBody setParentLocationIds(String parentLocationIds) {
        this.parentLocationIds = parentLocationIds;
        return this;
    }
    public String getParentLocationIds() {
        return this.parentLocationIds;
    }

    public DescribeCustomerFlowByLocationResponseBody setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }
    public Long getLocationId() {
        return this.locationId;
    }

    public DescribeCustomerFlowByLocationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCustomerFlowByLocationResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeCustomerFlowByLocationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeCustomerFlowByLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCustomerFlowByLocationResponseBody setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public static class DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem extends TeaModel {
        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("ParentLocationIds")
        public String parentLocationIds;

        @NameInMap("Percent")
        public Float percent;

        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("LocationName")
        public String locationName;

        @NameInMap("Count")
        public Long count;

        public static DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem self = new DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem setParentLocationIds(String parentLocationIds) {
            this.parentLocationIds = parentLocationIds;
            return this;
        }
        public String getParentLocationIds() {
            return this.parentLocationIds;
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem setPercent(Float percent) {
            this.percent = percent;
            return this;
        }
        public Float getPercent() {
            return this.percent;
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems extends TeaModel {
        @NameInMap("CustomerFlowItem")
        public java.util.List<DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem> customerFlowItem;

        public static DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems self = new DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerFlowByLocationResponseBodyCustomerFlowItems setCustomerFlowItem(java.util.List<DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem> customerFlowItem) {
            this.customerFlowItem = customerFlowItem;
            return this;
        }
        public java.util.List<DescribeCustomerFlowByLocationResponseBodyCustomerFlowItemsCustomerFlowItem> getCustomerFlowItem() {
            return this.customerFlowItem;
        }

    }

}
