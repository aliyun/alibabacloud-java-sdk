// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the endpoints of the instance.</p>
     */
    @NameInMap("DBInstanceNetInfos")
    public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos DBInstanceNetInfos;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **Classic**: classic network</p>
     * <p>*   **VPC**: virtual private cloud (VPC)</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The whitelist mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: standard whitelist mode</p>
     * <p>*   **safety**: enhanced whitelist mode</p>
     */
    @NameInMap("SecurityIPMode")
    public String securityIPMode;

    public static DescribeDBInstanceNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponseBody self = new DescribeDBInstanceNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponseBody setDBInstanceNetInfos(DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos DBInstanceNetInfos) {
        this.DBInstanceNetInfos = DBInstanceNetInfos;
        return this;
    }
    public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    public DescribeDBInstanceNetInfoResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstanceNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceNetInfoResponseBody setSecurityIPMode(String securityIPMode) {
        this.securityIPMode = securityIPMode;
        return this;
    }
    public String getSecurityIPMode() {
        return this.securityIPMode;
    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight extends TeaModel {
        /**
         * <p>The availability of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unavailable**</p>
         * <p>*   **Available**</p>
         */
        @NameInMap("Availability")
        public String availability;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Master**: primary instance</p>
         * <p>*   **Readonly**: read-only instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>A deprecated parameter.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The weight of the instance.</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights extends TeaModel {
        @NameInMap("DBInstanceWeight")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> DBInstanceWeight;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights setDBInstanceWeight(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> DBInstanceWeight) {
            this.DBInstanceWeight = DBInstanceWeight;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup extends TeaModel {
        /**
         * <p>The name of the IP address whitelist.</p>
         */
        @NameInMap("SecurityIPGroupName")
        public String securityIPGroupName;

        /**
         * <p>The IP address in the whitelist.</p>
         */
        @NameInMap("SecurityIPs")
        public String securityIPs;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup setSecurityIPGroupName(String securityIPGroupName) {
            this.securityIPGroupName = securityIPGroupName;
            return this;
        }
        public String getSecurityIPGroupName() {
            return this.securityIPGroupName;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup setSecurityIPs(String securityIPs) {
            this.securityIPs = securityIPs;
            return this;
        }
        public String getSecurityIPs() {
            return this.securityIPs;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups extends TeaModel {
        @NameInMap("securityIPGroup")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> securityIPGroup;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups setSecurityIPGroup(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> securityIPGroup) {
            this.securityIPGroup = securityIPGroup;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> getSecurityIPGroup() {
            return this.securityIPGroup;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo extends TeaModel {
        /**
         * <p>The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.</p>
         * <br>
         * <p>>  This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](~~428613~~).</p>
         */
        @NameInMap("BabelfishPort")
        public String babelfishPort;

        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Normal**: a regular endpoint</p>
         * <p>*   **ReadWriteSplitting**: a read/write splitting endpoint</p>
         */
        @NameInMap("ConnectionStringType")
        public String connectionStringType;

        /**
         * <p>The information about the instance weight.</p>
         * <br>
         * <p>>  This parameter is returned only when the read/write splitting feature is enabled for the instance.</p>
         */
        @NameInMap("DBInstanceWeights")
        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights DBInstanceWeights;

        /**
         * <p>The policy that is used to assign read weights. This parameter is returned only for a read/write splitting endpoint. Valid values:</p>
         * <br>
         * <p>*   **Standard**: The system automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.</p>
         * <p>*   **Custom**: You must manually allocate read weights to the instance and its read-only instances.</p>
         */
        @NameInMap("DistributionType")
        public String distributionType;

        /**
         * <p>The remaining validity period of the instance in the classic network in hybrid access mode. Unit: seconds.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type.</p>
         * <br>
         * <p>*   Valid values when the instance resides in the classic network:</p>
         * <br>
         * <p>    *   **Inner**</p>
         * <p>    *   **Public**</p>
         * <br>
         * <p>*   Valid values when the instance resides in a virtual private cloud (VPC):</p>
         * <br>
         * <p>    *   **Private**</p>
         * <p>    *   **Public**</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The latency threshold. This parameter is returned only for a read/write splitting endpoint. Unit: seconds.</p>
         * <br>
         * <p>>  If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS no longer forwards read requests to the read-only instance.</p>
         */
        @NameInMap("MaxDelayTime")
        public String maxDelayTime;

        /**
         * <p>The PgBouncer port.</p>
         * <br>
         * <p>>  This parameter is returned only when PgBouncer is enabled for the instance that runs PostgreSQL.</p>
         */
        @NameInMap("PGBouncerPort")
        public String PGBouncerPort;

        /**
         * <p>The port that is used to connect to the instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The IP addresses in the whitelist for the instance.</p>
         */
        @NameInMap("SecurityIPGroups")
        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups securityIPGroups;

        /**
         * <p>Indicates whether the IP version can be updated. Valid values:</p>
         * <br>
         * <p>*   **Enable**</p>
         * <p>*   **Disabled**</p>
         * <br>
         * <p>>  The IP version can be updated from IPv4 to IPv6.</p>
         */
        @NameInMap("Upgradeable")
        public String upgradeable;

        /**
         * <p>The VPC ID of the instance.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setBabelfishPort(String babelfishPort) {
            this.babelfishPort = babelfishPort;
            return this;
        }
        public String getBabelfishPort() {
            return this.babelfishPort;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setConnectionStringType(String connectionStringType) {
            this.connectionStringType = connectionStringType;
            return this;
        }
        public String getConnectionStringType() {
            return this.connectionStringType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setDBInstanceWeights(DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights DBInstanceWeights) {
            this.DBInstanceWeights = DBInstanceWeights;
            return this;
        }
        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights getDBInstanceWeights() {
            return this.DBInstanceWeights;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setDistributionType(String distributionType) {
            this.distributionType = distributionType;
            return this;
        }
        public String getDistributionType() {
            return this.distributionType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setMaxDelayTime(String maxDelayTime) {
            this.maxDelayTime = maxDelayTime;
            return this;
        }
        public String getMaxDelayTime() {
            return this.maxDelayTime;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setPGBouncerPort(String PGBouncerPort) {
            this.PGBouncerPort = PGBouncerPort;
            return this;
        }
        public String getPGBouncerPort() {
            return this.PGBouncerPort;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setSecurityIPGroups(DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups securityIPGroups) {
            this.securityIPGroups = securityIPGroups;
            return this;
        }
        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups getSecurityIPGroups() {
            return this.securityIPGroups;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setUpgradeable(String upgradeable) {
            this.upgradeable = upgradeable;
            return this;
        }
        public String getUpgradeable() {
            return this.upgradeable;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos extends TeaModel {
        @NameInMap("DBInstanceNetInfo")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setDBInstanceNetInfo(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo) {
            this.DBInstanceNetInfo = DBInstanceNetInfo;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo> getDBInstanceNetInfo() {
            return this.DBInstanceNetInfo;
        }

    }

}
