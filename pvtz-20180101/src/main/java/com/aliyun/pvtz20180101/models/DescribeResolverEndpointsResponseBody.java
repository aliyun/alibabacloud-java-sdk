// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointsResponseBody extends TeaModel {
    /**
     * <p>The endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<DescribeResolverEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83D1682B-B69A-4060-9FA8-2907C2A35600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The ID of the zone to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("AzId")
        public String azId;

        /**
         * <p>The IPv4 CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The source IP address of outbound traffic. The IP address must be within the specified CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jlgeyq4oazkh5xue****</p>
         */
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
        /**
         * <p>The time when the endpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-13 10:36:26</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the endpoint was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1594607786000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The source IP addresses of outbound traffic.</p>
         */
        @NameInMap("IpConfigs")
        public java.util.List<DescribeResolverEndpointsResponseBodyEndpointsIpConfigs> ipConfigs;

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-0jld3m9yq7l2cw12****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The state of the endpoint that you queried. Valid values:</p>
         * <ul>
         * <li>SUCCESS: The endpoint works as expected.</li>
         * <li>INIT: The endpoint is being created.</li>
         * <li>FAILED: The endpoint failed to be created.</li>
         * <li>CHANGE_INIT: The endpoint is being modified.</li>
         * <li>CHANGE_FAILED: The endpoint failed to be modified.</li>
         * <li>EXCEPTION: The endpoint encountered an exception.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the endpoint was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-13 10:38:24</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the endpoint was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1594607904000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The ID of the outbound VPC. All outbound Domain Name System (DNS) requests of the resolver are forwarded by this VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jlxhpfnj5bfu0bsd****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the outbound VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test-name</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The region ID of the outbound VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        /**
         * <p>The name of the region where the VPC resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China East 1 (Hangzhou)</p>
         */
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
