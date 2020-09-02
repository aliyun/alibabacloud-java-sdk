// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("LineOperator")
    public String lineOperator;

    @NameInMap("bandwidth")
    public Integer bandwidth;

    @NameInMap("PeerLocation")
    public String peerLocation;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CircuitCode")
    public String circuitCode;

    public static ModifyPhysicalConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeRequest self = new ModifyPhysicalConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setLineOperator(String lineOperator) {
        this.lineOperator = lineOperator;
        return this;
    }
    public String getLineOperator() {
        return this.lineOperator;
    }

    public ModifyPhysicalConnectionAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifyPhysicalConnectionAttributeRequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public ModifyPhysicalConnectionAttributeRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public ModifyPhysicalConnectionAttributeRequest setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
        this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
        return this;
    }
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    public ModifyPhysicalConnectionAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPhysicalConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPhysicalConnectionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPhysicalConnectionAttributeRequest setCircuitCode(String circuitCode) {
        this.circuitCode = circuitCode;
        return this;
    }
    public String getCircuitCode() {
        return this.circuitCode;
    }

}
