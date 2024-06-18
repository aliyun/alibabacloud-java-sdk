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
     * <p>The page number of the returned page. Valid values: any <strong>non-zero</strong> positive integer.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * 
         * <strong>example:</strong>
         * <p>Test database</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance state table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>: Pay-as-you-go instances never expire.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-03-27T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The instance is not locked.</li>
         * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The instance is automatically locked after it expires.</li>
         * <li><strong>LockByRestoration</strong>: The instance is automatically locked before it is rolled back.</li>
         * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked after its storage capacity is exhausted.</li>
         * <li><strong>LockReadInstanceByDiskQuota</strong>: The instance is a read-only instance and is automatically locked after its storage capacity is exhausted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
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
