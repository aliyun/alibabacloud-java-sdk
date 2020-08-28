// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstanceIPArrayListResponseItems items;

    public static DescribeDBInstanceIPArrayListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListResponse self = new DescribeDBInstanceIPArrayListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray extends TeaModel {
        @NameInMap("DBInstanceIPArrayName")
        @Validation(required = true)
        public String DBInstanceIPArrayName;

        @NameInMap("DBInstanceIPArrayAttribute")
        @Validation(required = true)
        public String DBInstanceIPArrayAttribute;

        @NameInMap("SecurityIPType")
        @Validation(required = true)
        public String securityIPType;

        @NameInMap("SecurityIPList")
        @Validation(required = true)
        public String securityIPList;

        @NameInMap("WhitelistNetworkType")
        @Validation(required = true)
        public String whitelistNetworkType;

        public static DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray self = new DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceIPArrayListResponseItems extends TeaModel {
        @NameInMap("DBInstanceIPArray")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray> DBInstanceIPArray;

        public static DescribeDBInstanceIPArrayListResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseItems self = new DescribeDBInstanceIPArrayListResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
