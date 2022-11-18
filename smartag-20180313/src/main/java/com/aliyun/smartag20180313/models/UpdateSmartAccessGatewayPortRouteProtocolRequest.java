// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayPortRouteProtocolRequest extends TeaModel {
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    @NameInMap("PortName")
    public String portName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoteAs")
    public String remoteAs;

    @NameInMap("RemoteIp")
    public String remoteIp;

    @NameInMap("ResourceUid")
    public String resourceUid;

    @NameInMap("RouteProtocol")
    public String routeProtocol;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

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
