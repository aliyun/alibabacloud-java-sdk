// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkPathRequest extends TeaModel {
    /**
     * <p>The description of the network path.</p>
     * 
     * <strong>example:</strong>
     * <p>Analyze the path from ECS to ECS</p>
     */
    @NameInMap("NetworkPathDescription")
    public String networkPathDescription;

    /**
     * <p>The name of the network path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs2PublicIp</p>
     */
    @NameInMap("NetworkPathName")
    public String networkPathName;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: Transmission Control Protocol (TCP)</li>
     * <li><strong>udp</strong>: User Datagram Protocol (UDP)</li>
     * <li><strong>icmp</strong>: Internet Control Message Protocol (ICMP)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID of the network path that you want to create.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm27qsxjj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the source resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zef4ngqfarepyun****</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.17.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The source port.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("SourcePort")
    public Integer sourcePort;

    /**
     * <p>The type of the source resource. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: the Elastic Compute Service (ECS) instance</li>
     * <li><strong>internetIp</strong>: the public IP address</li>
     * <li><strong>vsw</strong>: the vSwitch</li>
     * <li><strong>vpn</strong>: the VPN gateway</li>
     * <li><strong>vbr</strong>: the virtual border router (VBR)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The tags to add to the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkPathRequestTag> tag;

    /**
     * <p>The ID of the destination resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp13d0e064gubm****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.210</p>
     */
    @NameInMap("TargetIpAddress")
    public String targetIpAddress;

    /**
     * <p>The destination port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("TargetPort")
    public Integer targetPort;

    /**
     * <p>The type of the destination resource. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: the ECS instance</li>
     * <li><strong>internetIp</strong>: the public IP address</li>
     * <li><strong>vsw</strong>: the vSwitch</li>
     * <li><strong>vpn</strong>: the VPN gateway</li>
     * <li><strong>vbr</strong>: the VBR</li>
     * <li><strong>clb</strong>: the Classic Load Balancer (CLB) instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateNetworkPathRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPathRequest self = new CreateNetworkPathRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPathRequest setNetworkPathDescription(String networkPathDescription) {
        this.networkPathDescription = networkPathDescription;
        return this;
    }
    public String getNetworkPathDescription() {
        return this.networkPathDescription;
    }

    public CreateNetworkPathRequest setNetworkPathName(String networkPathName) {
        this.networkPathName = networkPathName;
        return this;
    }
    public String getNetworkPathName() {
        return this.networkPathName;
    }

    public CreateNetworkPathRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateNetworkPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkPathRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateNetworkPathRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateNetworkPathRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public CreateNetworkPathRequest setSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public CreateNetworkPathRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateNetworkPathRequest setTag(java.util.List<CreateNetworkPathRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNetworkPathRequestTag> getTag() {
        return this.tag;
    }

    public CreateNetworkPathRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateNetworkPathRequest setTargetIpAddress(String targetIpAddress) {
        this.targetIpAddress = targetIpAddress;
        return this;
    }
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }

    public CreateNetworkPathRequest setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public CreateNetworkPathRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class CreateNetworkPathRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * <p>You can add up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ops</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNetworkPathRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkPathRequestTag self = new CreateNetworkPathRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkPathRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNetworkPathRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
