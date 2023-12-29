// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnConnectionsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TunnelIds")
    public java.util.List<String> tunnelIds;

    @NameInMap("VpnConnectionIds")
    public java.util.List<String> vpnConnectionIds;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static DiagnoseVpnConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnConnectionsRequest self = new DiagnoseVpnConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DiagnoseVpnConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DiagnoseVpnConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DiagnoseVpnConnectionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DiagnoseVpnConnectionsRequest setTunnelIds(java.util.List<String> tunnelIds) {
        this.tunnelIds = tunnelIds;
        return this;
    }
    public java.util.List<String> getTunnelIds() {
        return this.tunnelIds;
    }

    public DiagnoseVpnConnectionsRequest setVpnConnectionIds(java.util.List<String> vpnConnectionIds) {
        this.vpnConnectionIds = vpnConnectionIds;
        return this;
    }
    public java.util.List<String> getVpnConnectionIds() {
        return this.vpnConnectionIds;
    }

    public DiagnoseVpnConnectionsRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
