// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateNetworkPathRequest extends TeaModel {
    /**
     * <p>The description of the network path.</p>
     */
    @NameInMap("NetworkPathDescription")
    public String networkPathDescription;

    /**
     * <p>The name of the network path.</p>
     */
    @NameInMap("NetworkPathName")
    public String networkPathName;

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
     * <p>The region ID of the network path that you want to create.</p>
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

    @NameInMap("Tag")
    public java.util.List<CreateNetworkPathRequestTag> tag;

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
        @NameInMap("Key")
        public String key;

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
