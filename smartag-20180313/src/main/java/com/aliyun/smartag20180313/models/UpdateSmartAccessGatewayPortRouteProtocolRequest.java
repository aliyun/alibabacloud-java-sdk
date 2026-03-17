// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayPortRouteProtocolRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only the SAG instances that belong to another Alibaba Cloud account. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    /**
     * <p>The port name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PortName")
    public String portName;

    /**
     * <p>The region ID of the SAG instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The autonomous system number (ASN) of the SAG device.</p>
     * <blockquote>
     * <p>When you enable BGP, you must set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65535</p>
     */
    @NameInMap("RemoteAs")
    public String remoteAs;

    /**
     * <p>The IP address of the peer device.</p>
     * <blockquote>
     * <p>When you enable BGP, you must set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("RemoteIp")
    public String remoteIp;

    /**
     * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>109790620697****</p>
     */
    @NameInMap("ResourceUid")
    public String resourceUid;

    /**
     * <p>The routing protocol. Valid values:</p>
     * <ul>
     * <li><strong>STATIC</strong></li>
     * <li><strong>OSPF</strong></li>
     * <li><strong>BGP</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("RouteProtocol")
    public String routeProtocol;

    /**
     * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-3manef62evrfr6****</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagf4dk****</p>
     */
    @NameInMap("SagSn")
    public String sagSn;

    /**
     * <p>The VLAN ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Vlan")
    public String vlan;

    public static UpdateSmartAccessGatewayPortRouteProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayPortRouteProtocolRequest self = new UpdateSmartAccessGatewayPortRouteProtocolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setRemoteAs(String remoteAs) {
        this.remoteAs = remoteAs;
        return this;
    }
    public String getRemoteAs() {
        return this.remoteAs;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }
    public String getRemoteIp() {
        return this.remoteIp;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setRouteProtocol(String routeProtocol) {
        this.routeProtocol = routeProtocol;
        return this;
    }
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolRequest setVlan(String vlan) {
        this.vlan = vlan;
        return this;
    }
    public String getVlan() {
        return this.vlan;
    }

}
