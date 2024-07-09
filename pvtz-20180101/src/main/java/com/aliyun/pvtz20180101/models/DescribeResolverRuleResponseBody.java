// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRuleResponseBody extends TeaModel {
    /**
     * <p>The virtual private clouds (VPCs) that are associated with the forwarding rule.</p>
     */
    @NameInMap("BindVpcs")
    public java.util.List<DescribeResolverRuleResponseBodyBindVpcs> bindVpcs;

    /**
     * <p>The time when the forwarding rule was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-13 10:51:44</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the forwarding rule was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1594608704000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The endpoint name.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The destination IP addresses.</p>
     */
    @NameInMap("ForwardIps")
    public java.util.List<DescribeResolverRuleResponseBodyForwardIps> forwardIps;

    /**
     * <p>The forwarding rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hra1**</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>forward rule-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13D5113B-7E34-407F-A9C1-D96CD2B04277</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the forwarding rule. Valid value:</p>
     * <ul>
     * <li>OUTBOUND: forwards Domain Name System (DNS) requests to one or more external IP addresses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OUTBOUND</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time when the forwarding rule was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-13 10:51:44</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The time when the forwarding rule was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1594608704000</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <p>The name of the forward zone.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeResolverRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRuleResponseBody self = new DescribeResolverRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRuleResponseBody setBindVpcs(java.util.List<DescribeResolverRuleResponseBodyBindVpcs> bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }
    public java.util.List<DescribeResolverRuleResponseBodyBindVpcs> getBindVpcs() {
        return this.bindVpcs;
    }

    public DescribeResolverRuleResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeResolverRuleResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeResolverRuleResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeResolverRuleResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public DescribeResolverRuleResponseBody setForwardIps(java.util.List<DescribeResolverRuleResponseBodyForwardIps> forwardIps) {
        this.forwardIps = forwardIps;
        return this;
    }
    public java.util.List<DescribeResolverRuleResponseBodyForwardIps> getForwardIps() {
        return this.forwardIps;
    }

    public DescribeResolverRuleResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeResolverRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeResolverRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResolverRuleResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeResolverRuleResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeResolverRuleResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeResolverRuleResponseBody setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class DescribeResolverRuleResponseBodyBindVpcs extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbl8m-vpc-id</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-name-test</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The type of the VPC. Valid values:</p>
         * <ul>
         * <li>STANDARD: standard VPC</li>
         * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        /**
         * <p>The Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>324542413</p>
         */
        @NameInMap("VpcUserId")
        public String vpcUserId;

        public static DescribeResolverRuleResponseBodyBindVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRuleResponseBodyBindVpcs self = new DescribeResolverRuleResponseBodyBindVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRuleResponseBodyBindVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcUserId(String vpcUserId) {
            this.vpcUserId = vpcUserId;
            return this;
        }
        public String getVpcUserId() {
            return this.vpcUserId;
        }

    }

    public static class DescribeResolverRuleResponseBodyForwardIps extends TeaModel {
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeResolverRuleResponseBodyForwardIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRuleResponseBodyForwardIps self = new DescribeResolverRuleResponseBodyForwardIps();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRuleResponseBodyForwardIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeResolverRuleResponseBodyForwardIps setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
