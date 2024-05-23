// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByExpireTimeResponseBody extends TeaModel {
    /**
     * <p>The details of the instances.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancesByExpireTimeResponseBodyItems items;

    /**
     * <p>The page number of the returned page. Valid values: any **non-zero** positive integer.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstancesByExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByExpireTimeResponseBody self = new DescribeDBInstancesByExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByExpireTimeResponseBody setItems(DescribeDBInstancesByExpireTimeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesByExpireTimeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime extends TeaModel {
        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The status of the instance. For more information, see [Instance state table](https://help.aliyun.com/document_detail/26315.html).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>> : Pay-as-you-go instances never expire.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked after it expires.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked before it is rolled back.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked after its storage capacity is exhausted.</p>
         * <p>*   **LockReadInstanceByDiskQuota**: The instance is a read-only instance and is automatically locked after its storage capacity is exhausted.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go.</p>
         * <p>*   **Prepaid**: subscription.</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime self = new DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class DescribeDBInstancesByExpireTimeResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceExpireTime")
        public java.util.List<DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime> DBInstanceExpireTime;

        public static DescribeDBInstancesByExpireTimeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByExpireTimeResponseBodyItems self = new DescribeDBInstancesByExpireTimeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItems setDBInstanceExpireTime(java.util.List<DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime> DBInstanceExpireTime) {
            this.DBInstanceExpireTime = DBInstanceExpireTime;
            return this;
        }
        public java.util.List<DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime> getDBInstanceExpireTime() {
            return this.DBInstanceExpireTime;
        }

    }

}
