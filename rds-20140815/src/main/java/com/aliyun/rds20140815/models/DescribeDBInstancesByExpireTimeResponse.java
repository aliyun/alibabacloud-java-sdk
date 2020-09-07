// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByExpireTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstancesByExpireTimeResponseItems items;

    public static DescribeDBInstancesByExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByExpireTimeResponse self = new DescribeDBInstancesByExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByExpireTimeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesByExpireTimeResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByExpireTimeResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstancesByExpireTimeResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesByExpireTimeResponse setItems(DescribeDBInstancesByExpireTimeResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesByExpireTimeResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        public static DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime self = new DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class DescribeDBInstancesByExpireTimeResponseItems extends TeaModel {
        @NameInMap("DBInstanceExpireTime")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime> DBInstanceExpireTime;

        public static DescribeDBInstancesByExpireTimeResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByExpireTimeResponseItems self = new DescribeDBInstancesByExpireTimeResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByExpireTimeResponseItems setDBInstanceExpireTime(java.util.List<DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime> DBInstanceExpireTime) {
            this.DBInstanceExpireTime = DBInstanceExpireTime;
            return this;
        }
        public java.util.List<DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime> getDBInstanceExpireTime() {
            return this.DBInstanceExpireTime;
        }

    }

}
