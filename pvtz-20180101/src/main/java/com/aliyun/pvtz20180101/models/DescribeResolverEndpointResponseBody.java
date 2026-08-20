// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointResponseBody extends TeaModel {
    /**
     * <p>The time when the endpoint was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-13 10:45:56</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the endpoint was created. This is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1594608356000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The ID of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>A list of IP address configurations for the outbound traffic source.</p>
     */
    @NameInMap("IpConfigs")
    public java.util.List<DescribeResolverEndpointResponseBodyIpConfigs> ipConfigs;

    /**
     * <p>The name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45020ED9-6319-4CA7-9475-6E8D6446E84F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the security group. The rules in the security group are applied to the outbound VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-8vb3sigz86xc-group-****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The status of the endpoint. Valid values:</p>
     * <ul>
     * <li><p>SUCCESS: The endpoint works as expected.</p>
     * </li>
     * <li><p>INIT: The endpoint is being created.</p>
     * </li>
     * <li><p>FAILED: The endpoint failed to be created.</p>
     * </li>
     * <li><p>CHANGE_INIT: The endpoint is being modified.</p>
     * </li>
     * <li><p>CHANGE_FAILED: The endpoint failed to be modified.</p>
     * </li>
     * <li><p>EXCEPTION: An exception occurred on the endpoint.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the endpoint was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-13 10:48:39</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The time when the endpoint was last updated. This is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1594608519000</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <p>The ID of the outbound virtual private cloud (VPC). All outbound DNS query traffic from the Resolver is forwarded through this VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-0jl96awrjt75ezglc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The name of the outbound VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-name-test</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    /**
     * <p>The ID of the region where the outbound VPC is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    /**
     * <p>The name of the region where the outbound VPC is located.</p>
     * 
     * <strong>example:</strong>
     * <p>North China</p>
     */
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
        /**
         * <p>The ID of the zone where the vSwitch is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
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
         * <p>An IP address within the specified CIDR block. If you leave this parameter empty, the system automatically assigns an IP address.</p>
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
