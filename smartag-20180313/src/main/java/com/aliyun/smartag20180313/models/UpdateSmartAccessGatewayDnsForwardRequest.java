// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayDnsForwardRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Wildcard domain names are supported. You can use the wildcard character asterisk (\*) to specify a wildcard domain name.</li>
     * </ul>
     * <p>For example, you can enter \*.baidu.com to specify the domain name baidu.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagv3dnsforward-nc7qabskj17werc7su</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * </blockquote>
     * <ul>
     * <li>This parameter is not in use. Ignore this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>first</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The number of the egress port.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is optional if OutboundPortType is set to PhysicalPort. Ignore this parameter if OutboundPortType is set to Tunnel.</li>
     * <li>The value of OutboundPortIndex is the unique index of the port name specified by poOutboundPortName. For example, 0 is the index for the port named eth0, and 2 is the index for the port named lte.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("OutboundPortIndex")
    public Integer outboundPortIndex;

    /**
     * <p>The egress port.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is optional if OutboundPortType is set to PhysicalPort. Ignore this parameter if OutboundPortType is set to Tunnel.</li>
     * <li>The value of OutboundPortIndex is the unique index of the port name specified by poOutboundPortName. For example, 0 is the index for the port named eth0, and 2 is the index for the port named lte.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eth0</p>
     */
    @NameInMap("OutboundPortName")
    public String outboundPortName;

    /**
     * <p>The type of the egress port.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>A value of Tunnel specifies a tunnel, and a value of PhysicalPort specifies a physical port.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PhysicalPort</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("OutboundPortType")
    public String outboundPortType;

    /**
     * <p>The ID of the region in which the SAG instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-v9un1ccz22owd76lf8</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number (SN) of the device.</p>
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
