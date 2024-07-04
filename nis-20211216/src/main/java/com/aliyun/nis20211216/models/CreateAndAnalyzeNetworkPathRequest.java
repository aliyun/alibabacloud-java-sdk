// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateAndAnalyzeNetworkPathRequest extends TeaModel {
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
     * <p>The ID of the region for which you want to initiate a task for analyzing network reachability.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the source resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf62y8khhbkbdrp6****</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The source port.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * <p>The ID of the destination resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-m5eactvw7wtpktv5****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.50.XX.XX</p>
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

    public static CreateAndAnalyzeNetworkPathRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAnalyzeNetworkPathRequest self = new CreateAndAnalyzeNetworkPathRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndAnalyzeNetworkPathRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateAndAnalyzeNetworkPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAndAnalyzeNetworkPathRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateAndAnalyzeNetworkPathRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public CreateAndAnalyzeNetworkPathRequest setSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public CreateAndAnalyzeNetworkPathRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateAndAnalyzeNetworkPathRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateAndAnalyzeNetworkPathRequest setTargetIpAddress(String targetIpAddress) {
        this.targetIpAddress = targetIpAddress;
        return this;
    }
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }

    public CreateAndAnalyzeNetworkPathRequest setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public CreateAndAnalyzeNetworkPathRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
