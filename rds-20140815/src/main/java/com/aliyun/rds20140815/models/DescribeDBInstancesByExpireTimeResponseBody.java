// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByExpireTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeDBInstancesByExpireTimeResponseBodyItems items;

    public static DescribeDBInstancesByExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByExpireTimeResponseBody self = new DescribeDBInstancesByExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesByExpireTimeResponseBody setItems(DescribeDBInstancesByExpireTimeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesByExpireTimeResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("PayType")
        public String payType;

        public static DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime self = new DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesByExpireTimeResponseBodyItemsDBInstanceExpireTime setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
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
