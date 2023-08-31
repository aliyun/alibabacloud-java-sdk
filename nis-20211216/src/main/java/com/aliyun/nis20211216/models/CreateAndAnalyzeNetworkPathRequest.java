// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateAndAnalyzeNetworkPathRequest extends TeaModel {
    @NameInMap("AuditParam")
    public String auditParam;

    /**
     * <p>The protocol type. Valid values:</p>
     * <br>
     * <p>*   **tcp**: Transmission Control Protocol (TCP)</p>
     * <p>*   **udp**: User Datagram Protocol (UDP)</p>
     * <p>*   **icmp**: Internet Control Message Protocol (ICMP)</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region for which you want to initiate a task for analyzing network reachability.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the source resource.</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source IP address.</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The source port.</p>
     */
    @NameInMap("SourcePort")
    public Integer sourcePort;

    /**
     * <p>The type of the source resource. Valid values:</p>
     * <br>
     * <p>*   **ecs**: the Elastic Compute Service (ECS) instance</p>
     * <p>*   **internetIp**: the public IP address</p>
     * <p>*   **vsw**: the vSwitch</p>
     * <p>*   **vpn**: the VPN gateway</p>
     * <p>*   **vbr**: the virtual border router (VBR)</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the destination resource.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The destination IP address.</p>
     */
    @NameInMap("TargetIpAddress")
    public String targetIpAddress;

    /**
     * <p>The destination port.</p>
     */
    @NameInMap("TargetPort")
    public Integer targetPort;

    /**
     * <p>The type of the destination resource. Valid values:</p>
     * <br>
     * <p>*   **ecs**: the ECS instance</p>
     * <p>*   **internetIp**: the public IP address</p>
     * <p>*   **vsw**: the vSwitch</p>
     * <p>*   **vpn**: the VPN gateway</p>
     * <p>*   **vbr**: the VBR</p>
     * <p>*   **clb**: the Classic Load Balancer (CLB) instance</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateAndAnalyzeNetworkPathRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAnalyzeNetworkPathRequest self = new CreateAndAnalyzeNetworkPathRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndAnalyzeNetworkPathRequest setAuditParam(String auditParam) {
        this.auditParam = auditParam;
        return this;
    }
    public String getAuditParam() {
        return this.auditParam;
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
