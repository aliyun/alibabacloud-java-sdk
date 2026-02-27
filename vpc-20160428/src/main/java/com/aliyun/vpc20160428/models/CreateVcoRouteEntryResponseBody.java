// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVcoRouteEntryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1658387202664</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>vco-p0w2jpkhi2eeop6q6****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <strong>example:</strong>
     * <p>Ipsec</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    /**
     * <strong>example:</strong>
     * <p>CFC4D13B-E680-3985-95B1-87AA155481DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the destination-based route.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <strong>example:</strong>
     * <p>published</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-p0w2jpkhi2eeop6q6****</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static CreateVcoRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVcoRouteEntryResponseBody self = new CreateVcoRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVcoRouteEntryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVcoRouteEntryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVcoRouteEntryResponseBody setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVcoRouteEntryResponseBody setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVcoRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVcoRouteEntryResponseBody setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVcoRouteEntryResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVcoRouteEntryResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public CreateVcoRouteEntryResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
