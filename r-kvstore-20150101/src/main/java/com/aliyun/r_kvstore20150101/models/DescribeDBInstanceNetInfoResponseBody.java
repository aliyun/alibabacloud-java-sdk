// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC**: The instance runs in a classic network.</p>
     * <p>*   **VPC**: The instance runs in a virtual private cloud (VPC).</p>
     */
    @NameInMap("NetInfoItems")
    public DescribeDBInstanceNetInfoResponseBodyNetInfoItems netInfoItems;

    /**
     * <p>The IP address.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponseBody self = new DescribeDBInstanceNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
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

    public static class DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo extends TeaModel {
        /**
         * <p>Indicates whether the address is a private endpoint. Valid values:</p>
         * <br>
         * <p>*   **0**: no.</p>
         * <p>*   **1**: yes.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeDBInstanceNetInfo**.</p>
         */
        @NameInMap("DirectConnection")
        public Integer directConnection;

        /**
         * <p>The expiration time of the classic network address of an ApsaraDB for Redis instance. Unit: seconds.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the IP address. Valid values:</p>
         * <br>
         * <p>*   **Public**: Internet.</p>
         * <p>*   **Inner**: classic network.</p>
         * <p>*   **Private**: VPC.</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **0**: the Internet.</p>
         * <p>*   **1**: classic network.</p>
         * <p>*   **2**: VPC.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("Upgradeable")
        public String upgradeable;

        /**
         * <p>Queries the network information about an ApsaraDB for Redis instance.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The list of network information about the instance.</p>
         */
        @NameInMap("VPCInstanceId")
        public String VPCInstanceId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo self = new DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setDirectConnection(Integer directConnection) {
            this.directConnection = directConnection;
            return this;
        }
        public Integer getDirectConnection() {
            return this.directConnection;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setUpgradeable(String upgradeable) {
            this.upgradeable = upgradeable;
            return this;
        }
        public String getUpgradeable() {
            return this.upgradeable;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setVPCInstanceId(String VPCInstanceId) {
            this.VPCInstanceId = VPCInstanceId;
            return this;
        }
        public String getVPCInstanceId() {
            return this.VPCInstanceId;
        }

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
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
