// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: The instance runs in a classic network.</li>
     * <li><strong>VPC</strong>: The instance runs in a virtual private cloud (VPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLASSIC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The network information about the instance.</p>
     */
    @NameInMap("NetInfoItems")
    public DescribeDBInstanceNetInfoResponseBodyNetInfoItems netInfoItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FC77D4E1-2A7C-4F0B-A4CC-CE0B9C314B9B</p>
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
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Internet</li>
         * <li><strong>1</strong>: classic network</li>
         * <li><strong>2</strong>: Virtual Private Cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>Indicates whether the address is a private endpoint. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The address is not a private endpoint.</li>
         * <li><strong>1</strong>: The address is a private endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectConnection")
        public Integer directConnection;

        /**
         * <p>The expiration time of the classic network endpoint. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5183779</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.49.***</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: Internet</li>
         * <li><strong>Inner</strong>: classic network</li>
         * <li><strong>Private</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inner</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>Indicates whether the address is the endpoint for the secondary zone. Valid values: 1 and 0. A value of 1 indicates that the address is the endpoint for the secondary zone.</p>
         * <blockquote>
         * <p> This parameter is returned only after you enable the multi-zone read/write splitting architecture for the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsSlaveProxy")
        public Integer isSlaveProxy;

        /**
         * <p>The service port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The remaining validity period of the classic network endpoint. Unit: seconds.</p>
         * <blockquote>
         * <p> **A value of 0 indicates that the endpoint never expires.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Upgradeable")
        public String upgradeable;

        /**
         * <p>The ID of the VPC to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1ky7j6qc7umk****</p>
         */
        @NameInMap("VPCInstanceId")
        public String VPCInstanceId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
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

        public DescribeDBInstanceNetInfoResponseBodyNetInfoItemsInstanceNetInfo setIsSlaveProxy(Integer isSlaveProxy) {
            this.isSlaveProxy = isSlaveProxy;
            return this;
        }
        public Integer getIsSlaveProxy() {
            return this.isSlaveProxy;
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
