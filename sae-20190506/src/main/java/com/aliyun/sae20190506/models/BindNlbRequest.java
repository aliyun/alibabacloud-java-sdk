// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindNlbRequest extends TeaModel {
    /**
     * <p>The address type. Valid values:</p>
     * <ul>
     * <li>Internet: public network address.</li>
     * <li>Intranet: private network address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The JSON array string of the listeners to be configured. The structure of each listener is as follows:</p>
     * <ul>
     * <li><p><strong>Port</strong>: Integer type, required. The load balancing listener port. Valid values: 0 to 65535.</p>
     * </li>
     * <li><p><strong>TargetPort</strong>: Integer type, required. The listening port of the container in the instance. Valid values: 0 to 65535.</p>
     * </li>
     * <li><p><strong>Protocol</strong>: String type, required. The listening protocol. Valid values: TCP, UDP, and TCPSSL.</p>
     * </li>
     * <li><p><strong>CertIds</strong>: String type, optional. The list of server certificates. This parameter takes effect only for TCPSSL listeners.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Port&quot;:80,&quot;TargetPort&quot;:8080,&quot;Protocol&quot;:&quot;TCP&quot;}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    /**
     * <p>The ID of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-7z7jjbzz44d82c9***</p>
     */
    @NameInMap("NlbId")
    public String nlbId;

    /**
     * <p>The JSON string of the zone and vSwitch mapping list. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones. The structure of a ZoneMapping is as follows:</p>
     * <ul>
     * <li><p>VSwitchId: String type. The vSwitch corresponding to the zone. Each zone can use only one vSwitch and one subnet.</p>
     * </li>
     * <li><p>ZoneId: String type. The zone ID of the Network Load Balancer (NLB) instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-sersdf****
     * cn-hangzhou-a</p>
     */
    @NameInMap("ZoneMappings")
    public String zoneMappings;

    public static BindNlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindNlbRequest self = new BindNlbRequest();
        return TeaModel.build(map, self);
    }

    public BindNlbRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public BindNlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindNlbRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public BindNlbRequest setNlbId(String nlbId) {
        this.nlbId = nlbId;
        return this;
    }
    public String getNlbId() {
        return this.nlbId;
    }

    public BindNlbRequest setZoneMappings(String zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public String getZoneMappings() {
        return this.zoneMappings;
    }

}
