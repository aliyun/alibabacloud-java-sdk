// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ForwardInfo extends TeaModel {
    @NameInMap("AccessType")
    public java.util.List<String> accessType;

    /**
     * <strong>example:</strong>
     * <p>dsw-notebook</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("EipAllocationId")
    public String eipAllocationId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ForwardPort")
    public String forwardPort;

    /**
     * <strong>example:</strong>
     * <p>ssh</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("SSHPublicKey")
    public String SSHPublicKey;

    public static ForwardInfo build(java.util.Map<String, ?> map) throws Exception {
        ForwardInfo self = new ForwardInfo();
        return TeaModel.build(map, self);
    }

    public ForwardInfo setAccessType(java.util.List<String> accessType) {
        this.accessType = accessType;
        return this;
    }
    public java.util.List<String> getAccessType() {
        return this.accessType;
    }

    public ForwardInfo setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public ForwardInfo setEipAllocationId(String eipAllocationId) {
        this.eipAllocationId = eipAllocationId;
        return this;
    }
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    public ForwardInfo setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ForwardInfo setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public ForwardInfo setForwardPort(String forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }
    public String getForwardPort() {
        return this.forwardPort;
    }

    public ForwardInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ForwardInfo setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ForwardInfo setSSHPublicKey(String SSHPublicKey) {
        this.SSHPublicKey = SSHPublicKey;
        return this;
    }
    public String getSSHPublicKey() {
        return this.SSHPublicKey;
    }

}
