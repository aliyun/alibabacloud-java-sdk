// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @NameInMap("DBInstanceNetInfos")
    public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos DBInstanceNetInfos;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Availability")
        public String availability;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("SecurityIPGroupName")
        public String securityIPGroupName;

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
        @NameInMap("BabelfishPort")
        public String babelfishPort;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("ConnectionStringType")
        public String connectionStringType;

        @NameInMap("DBInstanceWeights")
        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights DBInstanceWeights;

        @NameInMap("DistributionType")
        public String distributionType;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("IPType")
        public String IPType;

        @NameInMap("MaxDelayTime")
        public String maxDelayTime;

        @NameInMap("Port")
        public String port;

        @NameInMap("SecurityIPGroups")
        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups securityIPGroups;

        @NameInMap("Upgradeable")
        public String upgradeable;

        @NameInMap("VPCId")
        public String VPCId;

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
