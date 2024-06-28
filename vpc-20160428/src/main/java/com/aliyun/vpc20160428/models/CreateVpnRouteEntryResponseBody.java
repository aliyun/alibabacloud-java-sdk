// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the destination-based route was created. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1492747187000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the destination-based route.</p>
     * 
     * <strong>example:</strong>
     * <p>mytest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The next hop of the destination-based route.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-bp15oes1py4i66rmd****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The tunneling protocol. The value is set to <strong>Ipsec</strong>, which indicates the IPsec tunneling protocol.</p>
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
     * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The destination CIDR block of the destination-based route.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("RouteDest")
    public String routeDest;

    /**
     * <p>The status of the destination-based route.</p>
     * <ul>
     * <li><strong>published</strong>: advertised to the VPC route table.</li>
     * <li><strong>normal</strong>: not advertised to the VPC route table.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>published</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1a3kqjiiq9legfx****</p>
     */
    @NameInMap("VpnInstanceId")
    public String vpnInstanceId;

    /**
     * <p>The weight of the destination-based route. Valid values:</p>
     * <ul>
     * <li><strong>100</strong>: a high priority</li>
     * <li><strong>0</strong>: a low priority</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static CreateVpnRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnRouteEntryResponseBody self = new CreateVpnRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnRouteEntryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnRouteEntryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpnRouteEntryResponseBody setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public CreateVpnRouteEntryResponseBody setOverlayMode(String overlayMode) {
        this.overlayMode = overlayMode;
        return this;
    }
    public String getOverlayMode() {
        return this.overlayMode;
    }

    public CreateVpnRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnRouteEntryResponseBody setRouteDest(String routeDest) {
        this.routeDest = routeDest;
        return this;
    }
    public String getRouteDest() {
        return this.routeDest;
    }

    public CreateVpnRouteEntryResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateVpnRouteEntryResponseBody setVpnInstanceId(String vpnInstanceId) {
        this.vpnInstanceId = vpnInstanceId;
        return this;
    }
    public String getVpnInstanceId() {
        return this.vpnInstanceId;
    }

    public CreateVpnRouteEntryResponseBody setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
