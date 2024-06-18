// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the IP address whitelists.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstanceIPArrayListResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2B6AF71-DC32-4055-B477-43B348798D10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceIPArrayListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListResponseBody self = new DescribeDBInstanceIPArrayListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListResponseBody setItems(DescribeDBInstanceIPArrayListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceIPArrayListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceIPArrayListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray extends TeaModel {
        /**
         * <p>The attribute of the IP address whitelist. By default, this parameter is empty.</p>
         * <blockquote>
         * <p> A whitelist with the hidden attribute does not appear in the console. Such IP address whitelists are used to access Alibaba Cloud services, such as Data Transmission Service (DTS).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hidden</p>
         */
        @NameInMap("DBInstanceIPArrayAttribute")
        public String DBInstanceIPArrayAttribute;

        /**
         * <p>The name of the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_default</p>
         */
        @NameInMap("DBInstanceIPArrayName")
        public String DBInstanceIPArrayName;

        /**
         * <p>The IP addresses in the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The type of the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        public static DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray self = new DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }
        public String getDBInstanceIPArrayAttribute() {
            return this.DBInstanceIPArrayAttribute;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }
        public String getDBInstanceIPArrayName() {
            return this.DBInstanceIPArrayName;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

    }

    public static class DescribeDBInstanceIPArrayListResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceIPArray")
        public java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray;

        public static DescribeDBInstanceIPArrayListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseBodyItems self = new DescribeDBInstanceIPArrayListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIPArrayListResponseBodyItems setDBInstanceIPArray(java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray) {
            this.DBInstanceIPArray = DBInstanceIPArray;
            return this;
        }
        public java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

    }

}
