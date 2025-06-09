// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindNlbRequest extends TeaModel {
    /**
     * <p>The type of the IP addresses. Valid values:</p>
     * <ul>
     * <li>Internet: public endpoint.</li>
     * <li>Intranet: private endpoint.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the application to which the NLB instance is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The listener that you want to manage. The value is a string that consists of JSON arrays. Each listener contains the following fields:</p>
     * <ul>
     * <li><strong>port</strong>: the port number of the NLB listener. This field is required. Data type: integer. Valid values: 0 to 65535.</li>
     * <li><strong>TargetPort</strong>: the port number of the container listener. This field is required. Data type: integer. Valid values: 0 to 65535.</li>
     * <li><strong>Protocol</strong>: the listener protocol. This field is required. Data type: string. Valid values: TCP, UDP, and TCPSSL.</li>
     * <li><strong>CertIds</strong>: the IDs of the server certificates. This field is optional. Data type: string. This field is supported only by TCPSSL listeners.</li>
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
     * <p>The mappings between zones and vSwitches. The value is a JSON string. You can specify at most 10 zones. If the region supports two or more zones, specify at least two zones. A ZoneMapping contains the following fields:</p>
     * <ul>
     * <li>The ID of the vSwitch in the zone. Each zone can contain only one vSwitch and one subnet. Data type: string.</li>
     * <li>The zone ID of the NLB instance. Data type: string.</li>
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
