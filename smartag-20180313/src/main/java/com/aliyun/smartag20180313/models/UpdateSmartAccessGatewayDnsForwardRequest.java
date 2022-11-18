// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayDnsForwardRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MasterIp")
    public String masterIp;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OutboundPortIndex")
    public Integer outboundPortIndex;

    @NameInMap("OutboundPortName")
    public String outboundPortName;

    @NameInMap("OutboundPortType")
    public String outboundPortType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

    @NameInMap("SlaveIp")
    public String slaveIp;

    public static UpdateSmartAccessGatewayDnsForwardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayDnsForwardRequest self = new UpdateSmartAccessGatewayDnsForwardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setMasterIp(String masterIp) {
        this.masterIp = masterIp;
        return this;
    }
    public String getMasterIp() {
        return this.masterIp;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setOutboundPortIndex(Integer outboundPortIndex) {
        this.outboundPortIndex = outboundPortIndex;
        return this;
    }
    public Integer getOutboundPortIndex() {
        return this.outboundPortIndex;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setOutboundPortName(String outboundPortName) {
        this.outboundPortName = outboundPortName;
        return this;
    }
    public String getOutboundPortName() {
        return this.outboundPortName;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setOutboundPortType(String outboundPortType) {
        this.outboundPortType = outboundPortType;
        return this;
    }
    public String getOutboundPortType() {
        return this.outboundPortType;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

    public UpdateSmartAccessGatewayDnsForwardRequest setSlaveIp(String slaveIp) {
        this.slaveIp = slaveIp;
        return this;
    }
    public String getSlaveIp() {
        return this.slaveIp;
    }

}
