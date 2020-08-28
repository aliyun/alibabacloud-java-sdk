// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    public String instanceNetworkType;

    @NameInMap("SecurityIPMode")
    @Validation(required = true)
    public String securityIPMode;

    @NameInMap("DBInstanceNetInfos")
    @Validation(required = true)
    public DescribeDBInstanceNetInfoResponseDBInstanceNetInfos DBInstanceNetInfos;

    public static DescribeDBInstanceNetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponse self = new DescribeDBInstanceNetInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup extends TeaModel {
        @NameInMap("SecurityIPGroupName")
        @Validation(required = true)
        public String securityIPGroupName;

        @NameInMap("SecurityIPs")
        @Validation(required = true)
        public String securityIPs;

        public static DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup self = new DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups extends TeaModel {
        @NameInMap("securityIPGroup")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroupsSecurityIPGroup> securityIPGroup;

        public static DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups self = new DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("Availability")
        @Validation(required = true)
        public String availability;

        @NameInMap("Weight")
        @Validation(required = true)
        public String weight;

        public static DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight self = new DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights extends TeaModel {
        @NameInMap("DBInstanceWeight")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeightsDBInstanceWeight> DBInstanceWeight;

        public static DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights self = new DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfo extends TeaModel {
        @NameInMap("Upgradeable")
        @Validation(required = true)
        public String upgradeable;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("IPAddress")
        @Validation(required = true)
        public String IPAddress;

        @NameInMap("IPType")
        @Validation(required = true)
        public String IPType;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("VPCId")
        @Validation(required = true)
        public String VPCId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String VSwitchId;

        @NameInMap("ConnectionStringType")
        @Validation(required = true)
        public String connectionStringType;

        @NameInMap("MaxDelayTime")
        @Validation(required = true)
        public String maxDelayTime;

        @NameInMap("DistributionType")
        @Validation(required = true)
        public String distributionType;

        @NameInMap("SecurityIPGroups")
        @Validation(required = true)
        public DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoSecurityIPGroups securityIPGroups;

        @NameInMap("DBInstanceWeights")
        @Validation(required = true)
        public DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfoDBInstanceWeights DBInstanceWeights;

        public static DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfo self = new DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceNetInfoResponseDBInstanceNetInfos extends TeaModel {
        @NameInMap("DBInstanceNetInfo")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceNetInfoResponseDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo;

        public static DescribeDBInstanceNetInfoResponseDBInstanceNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseDBInstanceNetInfos self = new DescribeDBInstanceNetInfoResponseDBInstanceNetInfos();
            return TeaModel.build(map, self);
        }

    }

}
