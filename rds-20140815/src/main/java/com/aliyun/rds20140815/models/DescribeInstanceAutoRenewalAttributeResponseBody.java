// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    /**
     * <p>The renewal information of the instance.</p>
     */
    @NameInMap("Items")
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems items;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeInstanceAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewalAttributeResponseBody self = new DescribeInstanceAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setItems(DescribeInstanceAutoRenewalAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         */
        @NameInMap("AutoRenew")
        public String autoRenew;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The billing cycle of renewal.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the instance.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem self = new DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public String getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstanceAutoRenewalAttributeResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> item;

        public static DescribeInstanceAutoRenewalAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseBodyItems self = new DescribeInstanceAutoRenewalAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItems setItem(java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
