// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVcoRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The UNIX timestamp when the destination-based route entry was created. Unit: milliseconds.  </p>
     * <p>The timestamp follows the Unix time format, which represents the total number of milliseconds elapsed since 00:00:00 UTC on January 1, 1970, until the destination-based route entry was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1658387202664</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the destination-based route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The next hop of the destination-based route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-p0w2jpkhi2eeop6q6****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunnel protocol.  </p>
     * <p>Valid value: <strong>Ipsec</strong>, which indicates the IPsec tunnel protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>Ipsec</p>
     */
    @NameInMap("OverlayMode")
    public String overlayMode;

    /**
     * <p>The request ID.</p>
     * 
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
     * <p>The publish status of the destination-based route entry.  </p>
     * <p>Valid value: <strong>published</strong>, which indicates that the route entry has been published to the transit router instance.</p>
     * 
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
     * <p>The weight of the destination-based route entry.  </p>
     * <ul>
     * <li><strong>0</strong>: indicates low priority.  </li>
     * <li><strong>100</strong>: indicates high priority.</li>
     * </ul>
     * 
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
