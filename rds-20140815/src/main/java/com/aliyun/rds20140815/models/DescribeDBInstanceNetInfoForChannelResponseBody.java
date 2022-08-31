// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoForChannelResponseBody extends TeaModel {
    @NameInMap("DBInstanceNetInfos")
    public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos DBInstanceNetInfos;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceNetInfoForChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoForChannelResponseBody self = new DescribeDBInstanceNetInfoForChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoForChannelResponseBody setDBInstanceNetInfos(DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos DBInstanceNetInfos) {
        this.DBInstanceNetInfos = DBInstanceNetInfos;
        return this;
    }
    public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    public DescribeDBInstanceNetInfoForChannelResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstanceNetInfoForChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight extends TeaModel {
        @NameInMap("Availability")
        public String availability;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("Weight")
        public String weight;

        public static DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight self = new DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights extends TeaModel {
        @NameInMap("DBInstanceWeight")
        public java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> DBInstanceWeight;

        public static DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights self = new DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights setDBInstanceWeight(java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> DBInstanceWeight) {
            this.DBInstanceWeight = DBInstanceWeight;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

    }

    public static class DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup extends TeaModel {
        @NameInMap("SecurityIPGroupName")
        public String securityIPGroupName;

        @NameInMap("SecurityIPs")
        public String securityIPs;

        public static DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup self = new DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup setSecurityIPGroupName(String securityIPGroupName) {
            this.securityIPGroupName = securityIPGroupName;
            return this;
        }
        public String getSecurityIPGroupName() {
            return this.securityIPGroupName;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup setSecurityIPs(String securityIPs) {
            this.securityIPs = securityIPs;
            return this;
        }
        public String getSecurityIPs() {
            return this.securityIPs;
        }

    }

    public static class DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups extends TeaModel {
        @NameInMap("securityIPGroup")
        public java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> securityIPGroup;

        public static DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups self = new DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups setSecurityIPGroup(java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> securityIPGroup) {
            this.securityIPGroup = securityIPGroup;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> getSecurityIPGroup() {
            return this.securityIPGroup;
        }

    }

    public static class DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo extends TeaModel {
        @NameInMap("Availability")
        public String availability;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("ConnectionStringType")
        public String connectionStringType;

        @NameInMap("DBInstanceWeights")
        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights DBInstanceWeights;

        @NameInMap("DistributionType")
        public String distributionType;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("IPType")
        public String IPType;

        @NameInMap("MaxDelayTime")
        public String maxDelayTime;

        @NameInMap("Port")
        public String port;

        @NameInMap("SecurityIPGroups")
        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups securityIPGroups;

        @NameInMap("Upgradeable")
        public String upgradeable;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("expiredTime")
        public String expiredTime;

        public static DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo self = new DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setConnectionStringType(String connectionStringType) {
            this.connectionStringType = connectionStringType;
            return this;
        }
        public String getConnectionStringType() {
            return this.connectionStringType;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setDBInstanceWeights(DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights DBInstanceWeights) {
            this.DBInstanceWeights = DBInstanceWeights;
            return this;
        }
        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights getDBInstanceWeights() {
            return this.DBInstanceWeights;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setDistributionType(String distributionType) {
            this.distributionType = distributionType;
            return this;
        }
        public String getDistributionType() {
            return this.distributionType;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setMaxDelayTime(String maxDelayTime) {
            this.maxDelayTime = maxDelayTime;
            return this;
        }
        public String getMaxDelayTime() {
            return this.maxDelayTime;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setSecurityIPGroups(DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups securityIPGroups) {
            this.securityIPGroups = securityIPGroups;
            return this;
        }
        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups getSecurityIPGroups() {
            return this.securityIPGroups;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setUpgradeable(String upgradeable) {
            this.upgradeable = upgradeable;
            return this;
        }
        public String getUpgradeable() {
            return this.upgradeable;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

    }

    public static class DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos extends TeaModel {
        @NameInMap("DBInstanceNetInfo")
        public java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo;

        public static DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos self = new DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfos setDBInstanceNetInfo(java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo) {
            this.DBInstanceNetInfo = DBInstanceNetInfo;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoForChannelResponseBodyDBInstanceNetInfosDBInstanceNetInfo> getDBInstanceNetInfo() {
            return this.DBInstanceNetInfo;
        }

    }

}
