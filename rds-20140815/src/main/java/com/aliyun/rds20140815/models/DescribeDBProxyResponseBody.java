// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponseBody extends TeaModel {
    @NameInMap("DBProxyConnectStringItems")
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems;

    @NameInMap("DBProxyInstanceCurrentMinorVersion")
    public String DBProxyInstanceCurrentMinorVersion;

    @NameInMap("DBProxyInstanceLatestMinorVersion")
    public String DBProxyInstanceLatestMinorVersion;

    @NameInMap("DBProxyInstanceName")
    public String DBProxyInstanceName;

    @NameInMap("DBProxyInstanceNum")
    public Integer DBProxyInstanceNum;

    @NameInMap("DBProxyInstanceSize")
    public String DBProxyInstanceSize;

    @NameInMap("DBProxyInstanceStatus")
    public String DBProxyInstanceStatus;

    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    @NameInMap("DBProxyServiceStatus")
    public String DBProxyServiceStatus;

    @NameInMap("DbProxyEndpointItems")
    public DescribeDBProxyResponseBodyDbProxyEndpointItems dbProxyEndpointItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyResponseBody self = new DescribeDBProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyResponseBody setDBProxyConnectStringItems(DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems) {
        this.DBProxyConnectStringItems = DBProxyConnectStringItems;
        return this;
    }
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems getDBProxyConnectStringItems() {
        return this.DBProxyConnectStringItems;
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

    public DescribeDBProxyResponseBody setDBProxyInstanceNum(Integer DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public Integer getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceSize(String DBProxyInstanceSize) {
        this.DBProxyInstanceSize = DBProxyInstanceSize;
        return this;
    }
    public String getDBProxyInstanceSize() {
        return this.DBProxyInstanceSize;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceStatus(String DBProxyInstanceStatus) {
        this.DBProxyInstanceStatus = DBProxyInstanceStatus;
        return this;
    }
    public String getDBProxyInstanceStatus() {
        return this.DBProxyInstanceStatus;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public DescribeDBProxyResponseBody setDBProxyServiceStatus(String DBProxyServiceStatus) {
        this.DBProxyServiceStatus = DBProxyServiceStatus;
        return this;
    }
    public String getDBProxyServiceStatus() {
        return this.DBProxyServiceStatus;
    }

    public DescribeDBProxyResponseBody setDbProxyEndpointItems(DescribeDBProxyResponseBodyDbProxyEndpointItems dbProxyEndpointItems) {
        this.dbProxyEndpointItems = dbProxyEndpointItems;
        return this;
    }
    public DescribeDBProxyResponseBodyDbProxyEndpointItems getDbProxyEndpointItems() {
        return this.dbProxyEndpointItems;
    }

    public DescribeDBProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyConnectString")
        public String DBProxyConnectString;

        @NameInMap("DBProxyConnectStringNetType")
        public String DBProxyConnectStringNetType;

        @NameInMap("DBProxyConnectStringNetWorkType")
        public String DBProxyConnectStringNetWorkType;

        @NameInMap("DBProxyConnectStringPort")
        public String DBProxyConnectStringPort;

        @NameInMap("DBProxyEndpointId")
        public String DBProxyEndpointId;

        @NameInMap("DBProxyEndpointName")
        public String DBProxyEndpointName;

        @NameInMap("DBProxyVpcInstanceId")
        public String DBProxyVpcInstanceId;

        public static DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems self = new DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectString(String DBProxyConnectString) {
            this.DBProxyConnectString = DBProxyConnectString;
            return this;
        }
        public String getDBProxyConnectString() {
            return this.DBProxyConnectString;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }
        public String getDBProxyConnectStringNetType() {
            return this.DBProxyConnectStringNetType;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringNetWorkType(String DBProxyConnectStringNetWorkType) {
            this.DBProxyConnectStringNetWorkType = DBProxyConnectStringNetWorkType;
            return this;
        }
        public String getDBProxyConnectStringNetWorkType() {
            return this.DBProxyConnectStringNetWorkType;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }
        public String getDBProxyConnectStringPort() {
            return this.DBProxyConnectStringPort;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyEndpointId(String DBProxyEndpointId) {
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }
        public String getDBProxyEndpointId() {
            return this.DBProxyEndpointId;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyEndpointName(String DBProxyEndpointName) {
            this.DBProxyEndpointName = DBProxyEndpointName;
            return this;
        }
        public String getDBProxyEndpointName() {
            return this.DBProxyEndpointName;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
            this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
            return this;
        }
        public String getDBProxyVpcInstanceId() {
            return this.DBProxyVpcInstanceId;
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

    public static class DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems extends TeaModel {
        @NameInMap("DbProxyEndpointAliases")
        public String dbProxyEndpointAliases;

        @NameInMap("DbProxyEndpointName")
        public String dbProxyEndpointName;

        @NameInMap("DbProxyEndpointType")
        public String dbProxyEndpointType;

        @NameInMap("DbProxyReadWriteMode")
        public String dbProxyReadWriteMode;

        public static DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems self = new DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyEndpointAliases(String dbProxyEndpointAliases) {
            this.dbProxyEndpointAliases = dbProxyEndpointAliases;
            return this;
        }
        public String getDbProxyEndpointAliases() {
            return this.dbProxyEndpointAliases;
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyEndpointName(String dbProxyEndpointName) {
            this.dbProxyEndpointName = dbProxyEndpointName;
            return this;
        }
        public String getDbProxyEndpointName() {
            return this.dbProxyEndpointName;
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyEndpointType(String dbProxyEndpointType) {
            this.dbProxyEndpointType = dbProxyEndpointType;
            return this;
        }
        public String getDbProxyEndpointType() {
            return this.dbProxyEndpointType;
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyReadWriteMode(String dbProxyReadWriteMode) {
            this.dbProxyReadWriteMode = dbProxyReadWriteMode;
            return this;
        }
        public String getDbProxyReadWriteMode() {
            return this.dbProxyReadWriteMode;
        }

    }

    public static class DescribeDBProxyResponseBodyDbProxyEndpointItems extends TeaModel {
        @NameInMap("DbProxyEndpointItems")
        public java.util.List<DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems;

        public static DescribeDBProxyResponseBodyDbProxyEndpointItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDbProxyEndpointItems self = new DescribeDBProxyResponseBodyDbProxyEndpointItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItems setDbProxyEndpointItems(java.util.List<DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems) {
            this.dbProxyEndpointItems = dbProxyEndpointItems;
            return this;
        }
        public java.util.List<DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems> getDbProxyEndpointItems() {
            return this.dbProxyEndpointItems;
        }

    }

}
