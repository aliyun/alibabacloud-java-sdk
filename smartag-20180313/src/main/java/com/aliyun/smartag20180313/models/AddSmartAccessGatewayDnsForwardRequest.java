// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSmartAccessGatewayDnsForwardRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("MasterIp")
    public String masterIp;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OutboundPortIndex")
    public String outboundPortIndex;

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

    public static AddSmartAccessGatewayDnsForwardRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSmartAccessGatewayDnsForwardRequest self = new AddSmartAccessGatewayDnsForwardRequest();
        return TeaModel.build(map, self);
    }

    public AddSmartAccessGatewayDnsForwardRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddSmartAccessGatewayDnsForwardRequest setMasterIp(String masterIp) {
        this.masterIp = masterIp;
        return this;
    }
    public String getMasterIp() {
        return this.masterIp;
    }

    public AddSmartAccessGatewayDnsForwardRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddSmartAccessGatewayDnsForwardRequest setOutboundPortIndex(String outboundPortIndex) {
        this.outboundPortIndex = outboundPortIndex;
        return this;
    }
    public String getOutboundPortIndex() {
        return this.outboundPortIndex;
    }

    public AddSmartAccessGatewayDnsForwardRequest setOutboundPortName(String outboundPortName) {
        this.outboundPortName = outboundPortName;
        return this;
    }
    public String getOutboundPortName() {
        return this.outboundPortName;
    }

    public AddSmartAccessGatewayDnsForwardRequest setOutboundPortType(String outboundPortType) {
        this.outboundPortType = outboundPortType;
        return this;
    }
    public String getOutboundPortType() {
        return this.outboundPortType;
    }

    public AddSmartAccessGatewayDnsForwardRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddSmartAccessGatewayDnsForwardRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public AddSmartAccessGatewayDnsForwardRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

    public AddSmartAccessGatewayDnsForwardRequest setSlaveIp(String slaveIp) {
        this.slaveIp = slaveIp;
        return this;
    }
    public String getSlaveIp() {
        return this.slaveIp;
    }

}
