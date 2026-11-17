// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogRequest extends TeaModel {
    /**
     * <p>The sampling interval of the flow log. Unit: minutes. Valid values: <strong>1</strong>, <strong>5</strong>, and <strong>10</strong> (default).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AggregationInterval")
    public Integer aggregationInterval;

    /**
     * <p>The description of the flow log.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Flowlog.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the flow log.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The IP version of the traffic captured by the flow log.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("LogFormat")
    public String logFormat;

    /**
     * <p>The name of the Log Service Logstore that is used to store the captured traffic.</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FlowLogStore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the Log Service project that is used to manage the captured traffic.</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, and hyphens (-).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FlowLogProject</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region ID of the flow log. You can call the <a href="https://help.aliyun.com/document_detail/448570.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazdjdhd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource whose traffic you want to capture.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-askldfas****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource whose traffic you want to catch. Valid values:</p>
     * <ul>
     * <li><p><strong>NetworkInterface</strong>: elastic network interfaces (ENIs), which act as a network interface controller (NIC).</p>
     * </li>
     * <li><p><strong>VSwitch</strong>: all elastic network interfaces (ENIs) in the vSwitch.</p>
     * </li>
     * <li><p><strong>VPC</strong>: all elastic network interfaces (ENIs) in the virtual private cloud (VPC).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NetworkInterface</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFlowLogRequestTag> tag;

    /**
     * <p>The traffic path to catch. Valid values:</p>
     * <ul>
     * <li><strong>all</strong> (default): catches all traffic.</li>
     * <li><strong>internetGateway</strong>: catches traffic to access the Internet.</li>
     * <li><strong>natGateway</strong>: catches traffic through NAT gateways.</li>
     * <li><strong>vpnGateway</strong>: catches traffic through VPN gateways.</li>
     * <li><strong>transitRouter</strong>: catches traffic through TR.</li>
     * <li><strong>gatewayEndpoint</strong>: catches traffic through gateway endpoints to access cloud services.</li>
     * <li><strong>vbr</strong>: catches traffic through the border router (VBR) to access Express Connect circuits.</li>
     * <li><strong>ecr</strong>: catches traffic through the Express Connect Router (ECR).</li>
     * <li><strong>ipv4Gateway</strong>: catches traffic to access the Internet through IPv4 gateways.</li>
     * <li><strong>gatewayLoadBalancerEndpoint</strong>: catches traffic through the Gateway Load Balancer endpoint (GWLBe).</li>
     * </ul>
     */
    @NameInMap("TrafficPath")
    public java.util.List<String> trafficPath;

    /**
     * <p>The traffic type to catch. Valid values:</p>
     * <ul>
     * <li><p><strong>All</strong>: all traffic.</p>
     * </li>
     * <li><p><strong>Allow</strong>: traffic allowed by access control.</p>
     * </li>
     * <li><p><strong>Drop</strong>: traffic that access control rules deny.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static CreateFlowLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogRequest self = new CreateFlowLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogRequest setAggregationInterval(Integer aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
    public Integer getAggregationInterval() {
        return this.aggregationInterval;
    }

    public CreateFlowLogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowLogRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public CreateFlowLogRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateFlowLogRequest setLogFormat(String logFormat) {
        this.logFormat = logFormat;
        return this;
    }
    public String getLogFormat() {
        return this.logFormat;
    }

    public CreateFlowLogRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public CreateFlowLogRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFlowLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFlowLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowLogRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFlowLogRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateFlowLogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateFlowLogRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateFlowLogRequest setTag(java.util.List<CreateFlowLogRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFlowLogRequestTag> getTag() {
        return this.tag;
    }

    public CreateFlowLogRequest setTrafficPath(java.util.List<String> trafficPath) {
        this.trafficPath = trafficPath;
        return this;
    }
    public java.util.List<String> getTrafficPath() {
        return this.trafficPath;
    }

    public CreateFlowLogRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

    public static class CreateFlowLogRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, do not enter an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, you can enter an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFlowLogRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowLogRequestTag self = new CreateFlowLogRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFlowLogRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFlowLogRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
