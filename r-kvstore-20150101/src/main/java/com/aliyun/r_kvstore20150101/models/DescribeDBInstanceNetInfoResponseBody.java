// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @NameInMap("NetInfoItems")
    public DescribeDBInstanceNetInfoResponseBodyNetInfoItems netInfoItems;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    public static DescribeDBInstanceNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponseBody self = new DescribeDBInstanceNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponseBody setNetInfoItems(DescribeDBInstanceNetInfoResponseBodyNetInfoItems netInfoItems) {
        this.netInfoItems = netInfoItems;
        return this;
    }
    public DescribeDBInstanceNetInfoResponseBodyNetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    public DescribeDBInstanceNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceNetInfoResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public static class DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo extends TeaModel {
        @NameInMap("DirectConnection")
        public Integer directConnection;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("Upgradeable")
        public String upgradeable;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IPType")
        public String IPType;

        @NameInMap("VPCInstanceId")
        public String VPCInstanceId;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("IPAddress")
        public String IPAddress;

        public static DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo self = new DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setDirectConnection(Integer directConnection) {
            this.directConnection = directConnection;
            return this;
        }
        public Integer getDirectConnection() {
            return this.directConnection;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setUpgradeable(String upgradeable) {
            this.upgradeable = upgradeable;
            return this;
        }
        public String getUpgradeable() {
            return this.upgradeable;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setVPCInstanceId(String VPCInstanceId) {
            this.VPCInstanceId = VPCInstanceId;
            return this;
        }
        public String getVPCInstanceId() {
            return this.VPCInstanceId;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyNetInfoItems extends TeaModel {
        @NameInMap("InstanceNetInfo")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo> instanceNetInfo;

        public static DescribeDBInstanceNetInfoResponseBodyNetInfoItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyNetInfoItems self = new DescribeDBInstanceNetInfoResponseBodyNetInfoItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItems setInstanceNetInfo(java.util.List<DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo> instanceNetInfo) {
            this.instanceNetInfo = instanceNetInfo;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo> getInstanceNetInfo() {
            return this.instanceNetInfo;
        }

    }

}
