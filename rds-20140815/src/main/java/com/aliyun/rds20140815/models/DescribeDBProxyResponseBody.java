// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBProxyServiceStatus")
    public String DBProxyServiceStatus;

    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    @NameInMap("DBProxyInstanceNum")
    public Integer DBProxyInstanceNum;

    @NameInMap("DBProxyInstanceStatus")
    public String DBProxyInstanceStatus;

    @NameInMap("DBProxyInstanceCurrentMinorVersion")
    public String DBProxyInstanceCurrentMinorVersion;

    @NameInMap("DBProxyInstanceLatestMinorVersion")
    public String DBProxyInstanceLatestMinorVersion;

    @NameInMap("DBProxyInstanceName")
    public String DBProxyInstanceName;

    @NameInMap("DBProxyConnectStringItems")
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems;

    public static DescribeDBProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyResponseBody self = new DescribeDBProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBProxyResponseBody setDBProxyServiceStatus(String DBProxyServiceStatus) {
        this.DBProxyServiceStatus = DBProxyServiceStatus;
        return this;
    }
    public String getDBProxyServiceStatus() {
        return this.DBProxyServiceStatus;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceNum(Integer DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public Integer getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceStatus(String DBProxyInstanceStatus) {
        this.DBProxyInstanceStatus = DBProxyInstanceStatus;
        return this;
    }
    public String getDBProxyInstanceStatus() {
        return this.DBProxyInstanceStatus;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceCurrentMinorVersion(String DBProxyInstanceCurrentMinorVersion) {
        this.DBProxyInstanceCurrentMinorVersion = DBProxyInstanceCurrentMinorVersion;
        return this;
    }
    public String getDBProxyInstanceCurrentMinorVersion() {
        return this.DBProxyInstanceCurrentMinorVersion;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceLatestMinorVersion(String DBProxyInstanceLatestMinorVersion) {
        this.DBProxyInstanceLatestMinorVersion = DBProxyInstanceLatestMinorVersion;
        return this;
    }
    public String getDBProxyInstanceLatestMinorVersion() {
        return this.DBProxyInstanceLatestMinorVersion;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceName(String DBProxyInstanceName) {
        this.DBProxyInstanceName = DBProxyInstanceName;
        return this;
    }
    public String getDBProxyInstanceName() {
        return this.DBProxyInstanceName;
    }

    public DescribeDBProxyResponseBody setDBProxyConnectStringItems(DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems) {
        this.DBProxyConnectStringItems = DBProxyConnectStringItems;
        return this;
    }
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems getDBProxyConnectStringItems() {
        return this.DBProxyConnectStringItems;
    }

    public static class DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyEndpointId")
        public String DBProxyEndpointId;

        @NameInMap("DBProxyConnectString")
        public String DBProxyConnectString;

        @NameInMap("DBProxyConnectStringPort")
        public String DBProxyConnectStringPort;

        @NameInMap("DBProxyConnectStringNetType")
        public String DBProxyConnectStringNetType;

        @NameInMap("DBProxyVpcInstanceId")
        public String DBProxyVpcInstanceId;

        @NameInMap("DBProxyEndpointName")
        public String DBProxyEndpointName;

        @NameInMap("DBProxyConnectStringNetWorkType")
        public String DBProxyConnectStringNetWorkType;

        public static DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems self = new DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyEndpointId(String DBProxyEndpointId) {
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }
        public String getDBProxyEndpointId() {
            return this.DBProxyEndpointId;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectString(String DBProxyConnectString) {
            this.DBProxyConnectString = DBProxyConnectString;
            return this;
        }
        public String getDBProxyConnectString() {
            return this.DBProxyConnectString;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }
        public String getDBProxyConnectStringPort() {
            return this.DBProxyConnectStringPort;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }
        public String getDBProxyConnectStringNetType() {
            return this.DBProxyConnectStringNetType;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
            this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
            return this;
        }
        public String getDBProxyVpcInstanceId() {
            return this.DBProxyVpcInstanceId;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyEndpointName(String DBProxyEndpointName) {
            this.DBProxyEndpointName = DBProxyEndpointName;
            return this;
        }
        public String getDBProxyEndpointName() {
            return this.DBProxyEndpointName;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringNetWorkType(String DBProxyConnectStringNetWorkType) {
            this.DBProxyConnectStringNetWorkType = DBProxyConnectStringNetWorkType;
            return this;
        }
        public String getDBProxyConnectStringNetWorkType() {
            return this.DBProxyConnectStringNetWorkType;
        }

    }

    public static class DescribeDBProxyResponseBodyDBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyConnectStringItems")
        public java.util.List<DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems;

        public static DescribeDBProxyResponseBodyDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDBProxyConnectStringItems self = new DescribeDBProxyResponseBodyDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItems setDBProxyConnectStringItems(java.util.List<DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems) {
            this.DBProxyConnectStringItems = DBProxyConnectStringItems;
            return this;
        }
        public java.util.List<DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems> getDBProxyConnectStringItems() {
            return this.DBProxyConnectStringItems;
        }

    }

}
