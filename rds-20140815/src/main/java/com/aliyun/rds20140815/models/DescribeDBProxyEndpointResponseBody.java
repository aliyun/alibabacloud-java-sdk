// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    @NameInMap("DBProxyConnectStringPort")
    public String DBProxyConnectStringPort;

    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    @NameInMap("DBProxyFeatures")
    public String DBProxyFeatures;

    @NameInMap("DbProxyEndpointAliases")
    public String dbProxyEndpointAliases;

    @NameInMap("DbProxyEndpointReadWriteMode")
    public String dbProxyEndpointReadWriteMode;

    @NameInMap("EndpointConnectItems")
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems;

    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBProxyEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyEndpointResponseBody self = new DescribeDBProxyEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectString(String DBProxyConnectString) {
        this.DBProxyConnectString = DBProxyConnectString;
        return this;
    }
    public String getDBProxyConnectString() {
        return this.DBProxyConnectString;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
        this.DBProxyConnectStringPort = DBProxyConnectStringPort;
        return this;
    }
    public String getDBProxyConnectStringPort() {
        return this.DBProxyConnectStringPort;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyFeatures(String DBProxyFeatures) {
        this.DBProxyFeatures = DBProxyFeatures;
        return this;
    }
    public String getDBProxyFeatures() {
        return this.DBProxyFeatures;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointAliases(String dbProxyEndpointAliases) {
        this.dbProxyEndpointAliases = dbProxyEndpointAliases;
        return this;
    }
    public String getDbProxyEndpointAliases() {
        return this.dbProxyEndpointAliases;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
        this.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
        return this;
    }
    public String getDbProxyEndpointReadWriteMode() {
        return this.dbProxyEndpointReadWriteMode;
    }

    public DescribeDBProxyEndpointResponseBody setEndpointConnectItems(DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems) {
        this.endpointConnectItems = endpointConnectItems;
        return this;
    }
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems getEndpointConnectItems() {
        return this.endpointConnectItems;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
        this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
        return this;
    }
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
        this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
        return this;
    }
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
        this.readOnlyInstanceWeight = readOnlyInstanceWeight;
        return this;
    }
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    public DescribeDBProxyEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems extends TeaModel {
        @NameInMap("DbProxyEndpointConnectString")
        public String dbProxyEndpointConnectString;

        @NameInMap("DbProxyEndpointNetType")
        public String dbProxyEndpointNetType;

        @NameInMap("DbProxyEndpointPort")
        public String dbProxyEndpointPort;

        public static DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems self = new DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems setDbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
            this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
            return this;
        }
        public String getDbProxyEndpointConnectString() {
            return this.dbProxyEndpointConnectString;
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems setDbProxyEndpointNetType(String dbProxyEndpointNetType) {
            this.dbProxyEndpointNetType = dbProxyEndpointNetType;
            return this;
        }
        public String getDbProxyEndpointNetType() {
            return this.dbProxyEndpointNetType;
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems setDbProxyEndpointPort(String dbProxyEndpointPort) {
            this.dbProxyEndpointPort = dbProxyEndpointPort;
            return this;
        }
        public String getDbProxyEndpointPort() {
            return this.dbProxyEndpointPort;
        }

    }

    public static class DescribeDBProxyEndpointResponseBodyEndpointConnectItems extends TeaModel {
        @NameInMap("EndpointConnectItems")
        public java.util.List<DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems> endpointConnectItems;

        public static DescribeDBProxyEndpointResponseBodyEndpointConnectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyEndpointResponseBodyEndpointConnectItems self = new DescribeDBProxyEndpointResponseBodyEndpointConnectItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItems setEndpointConnectItems(java.util.List<DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems> endpointConnectItems) {
            this.endpointConnectItems = endpointConnectItems;
            return this;
        }
        public java.util.List<DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems> getEndpointConnectItems() {
            return this.endpointConnectItems;
        }

    }

}
