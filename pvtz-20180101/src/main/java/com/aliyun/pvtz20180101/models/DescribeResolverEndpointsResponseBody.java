// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    public java.util.List<DescribeResolverEndpointsResponseBodyEndpoints> endpoints;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeResolverEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverEndpointsResponseBody self = new DescribeResolverEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverEndpointsResponseBody setEndpoints(java.util.List<DescribeResolverEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<DescribeResolverEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public DescribeResolverEndpointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResolverEndpointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResolverEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResolverEndpointsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeResolverEndpointsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeResolverEndpointsResponseBodyEndpointsIpConfigs extends TeaModel {
        @NameInMap("AzId")
        public String azId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeResolverEndpointsResponseBodyEndpointsIpConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverEndpointsResponseBodyEndpointsIpConfigs self = new DescribeResolverEndpointsResponseBodyEndpointsIpConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverEndpointsResponseBodyEndpointsIpConfigs setAzId(String azId) {
            this.azId = azId;
            return this;
        }
        public String getAzId() {
            return this.azId;
        }

        public DescribeResolverEndpointsResponseBodyEndpointsIpConfigs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeResolverEndpointsResponseBodyEndpointsIpConfigs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeResolverEndpointsResponseBodyEndpointsIpConfigs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeResolverEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Id")
        public String id;

        @NameInMap("IpConfigs")
        public java.util.List<DescribeResolverEndpointsResponseBodyEndpointsIpConfigs> ipConfigs;

        @NameInMap("Name")
        public String name;

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

        public static DescribeResolverEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverEndpointsResponseBodyEndpoints self = new DescribeResolverEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setIpConfigs(java.util.List<DescribeResolverEndpointsResponseBodyEndpointsIpConfigs> ipConfigs) {
            this.ipConfigs = ipConfigs;
            return this;
        }
        public java.util.List<DescribeResolverEndpointsResponseBodyEndpointsIpConfigs> getIpConfigs() {
            return this.ipConfigs;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        public DescribeResolverEndpointsResponseBodyEndpoints setVpcRegionName(String vpcRegionName) {
            this.vpcRegionName = vpcRegionName;
            return this;
        }
        public String getVpcRegionName() {
            return this.vpcRegionName;
        }

    }

}
