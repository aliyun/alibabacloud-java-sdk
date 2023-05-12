// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("Id")
    public String id;

    @NameInMap("IpConfigs")
    public java.util.List<DescribeResolverEndpointResponseBodyIpConfigs> ipConfigs;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    @NameInMap("VpcRegionName")
    public String vpcRegionName;

    public static DescribeResolverEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverEndpointResponseBody self = new DescribeResolverEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverEndpointResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeResolverEndpointResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeResolverEndpointResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeResolverEndpointResponseBody setIpConfigs(java.util.List<DescribeResolverEndpointResponseBodyIpConfigs> ipConfigs) {
        this.ipConfigs = ipConfigs;
        return this;
    }
    public java.util.List<DescribeResolverEndpointResponseBodyIpConfigs> getIpConfigs() {
        return this.ipConfigs;
    }

    public DescribeResolverEndpointResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeResolverEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResolverEndpointResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeResolverEndpointResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeResolverEndpointResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeResolverEndpointResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeResolverEndpointResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeResolverEndpointResponseBody setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public DescribeResolverEndpointResponseBody setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public DescribeResolverEndpointResponseBody setVpcRegionName(String vpcRegionName) {
        this.vpcRegionName = vpcRegionName;
        return this;
    }
    public String getVpcRegionName() {
        return this.vpcRegionName;
    }

    public static class DescribeResolverEndpointResponseBodyIpConfigs extends TeaModel {
        @NameInMap("AzId")
        public String azId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeResolverEndpointResponseBodyIpConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverEndpointResponseBodyIpConfigs self = new DescribeResolverEndpointResponseBodyIpConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverEndpointResponseBodyIpConfigs setAzId(String azId) {
            this.azId = azId;
            return this;
        }
        public String getAzId() {
            return this.azId;
        }

        public DescribeResolverEndpointResponseBodyIpConfigs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeResolverEndpointResponseBodyIpConfigs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeResolverEndpointResponseBodyIpConfigs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
