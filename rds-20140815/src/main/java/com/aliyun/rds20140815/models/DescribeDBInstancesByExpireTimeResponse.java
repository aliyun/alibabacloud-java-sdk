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

        public static DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime self = new DescribeDBInstancesByExpireTimeResponseItemsDBInstanceExpireTime();
            return TeaModel.build(map, self);
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

    }

}
