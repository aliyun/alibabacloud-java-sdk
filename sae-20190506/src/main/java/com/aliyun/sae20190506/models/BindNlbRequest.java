// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindNlbRequest extends TeaModel {
    /**
     * <p>The address type of the NLB instance.</p>
     * <ul>
     * <li><p><code>Internet</code>: a public IP address.</p>
     * </li>
     * <li><p><code>Intranet</code>: a private IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the target application.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The listeners, specified as a JSON-formatted string. Each listener object contains the following fields:</p>
     * <ul>
     * <li><p><strong>Port</strong>: Integer. Required. The listener port. Valid values: 0 to 65535.</p>
     * </li>
     * <li><p><strong>TargetPort</strong>: Integer. Required. The port on the application instance that receives traffic. Valid values: 0 to 65535.</p>
     * </li>
     * <li><p><strong>Protocol</strong>: String. Required. The listener protocol. Valid values: <code>TCP</code>, <code>UDP</code>, and <code>TCPSSL</code>.</p>
     * </li>
     * <li><p><strong>CertIds</strong>: String. Optional. The server certificate IDs. This parameter is required only for <code>TCPSSL</code> listeners.</p>
     * </li>
     * </ul>
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
     * <p>The mappings between zones and vSwitches, specified as a JSON-formatted string. You can add up to 10 zones. If the current region supports two or more zones, you must specify at least two zones. Each <code>ZoneMapping</code> object contains the following fields:</p>
     * <ul>
     * <li><p><strong>VSwitchId</strong>: String. The ID of the vSwitch in the specified zone. Each zone can have only one vSwitch and one subnet.</p>
     * </li>
     * <li><p>ZoneId, String, the zone ID of the Network Load Balancer instance.</p>
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
