// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSmartAccessGatewayDnsForwardRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <blockquote>
     * <ul>
     * <li>Wildcard domain names and full match are supported. You can enter an asterisk (*) for the domain name to match all. Examples:
     * *.baidu.com. The allowed input format is baidu.com.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The primary DNS server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>114.114.114.114</p>
     */
    @NameInMap("MasterIp")
    public String masterIp;

    /**
     * <p>The forwarding mode.</p>
     * <blockquote>
     * <ul>
     * <li>This field is invalid. You can ignore it.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>first</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The outbound port index.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is optional when OutboundPortType is set to PhysicalPort, and is not required when OutboundPortType is set to Tunnel.</li>
     * <li>OutboundPortIndex and OutboundPortName have a one-to-one mapping: 0 - eth0; 2 - lte.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OutboundPortIndex")
    public String outboundPortIndex;

    /**
     * <p>The outbound port.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is optional when OutboundPortType is set to PhysicalPort, and is not required when OutboundPortType is set to Tunnel.</li>
     * <li>OutboundPortIndex and OutboundPortName have a one-to-one mapping: 0 - eth0; 2 - lte.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eth0</p>
     */
    @NameInMap("OutboundPortName")
    public String outboundPortName;

    /**
     * <p>The outbound port type.</p>
     * <blockquote>
     * <ul>
     * <li>A value of Tunnel indicates a tunnel port, and a value of PhysicalPort indicates a physical port.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Tunnel</p>
     */
    @NameInMap("OutboundPortType")
    public String outboundPortType;

    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-v9un1ccz22owd76lf8</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagf4dkqh78</p>
     */
    @NameInMap("SagSn")
    public String sagSn;

    /**
     * <p>The secondary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.14</p>
     */
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
