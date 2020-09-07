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

    public DescribeDBInstanceIPArrayListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceIPArrayListResponse setItems(DescribeDBInstanceIPArrayListResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceIPArrayListResponseItems getItems() {
        return this.items;
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

        public DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }
        public String getDBInstanceIPArrayName() {
            return this.DBInstanceIPArrayName;
        }

        public DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }
        public String getDBInstanceIPArrayAttribute() {
            return this.DBInstanceIPArrayAttribute;
        }

        public DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray setWhitelistNetworkType(String whitelistNetworkType) {
            this.whitelistNetworkType = whitelistNetworkType;
            return this;
        }
        public String getWhitelistNetworkType() {
            return this.whitelistNetworkType;
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

        public DescribeDBInstanceIPArrayListResponseItems setDBInstanceIPArray(java.util.List<DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray> DBInstanceIPArray) {
            this.DBInstanceIPArray = DBInstanceIPArray;
            return this;
        }
        public java.util.List<DescribeDBInstanceIPArrayListResponseItemsDBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

    }

}
