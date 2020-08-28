// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("RemoteSubnet")
    public String remoteSubnet;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("IkeConfig")
    public String ikeConfig;

    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    @NameInMap("HealthCheckConfig")
    public String healthCheckConfig;

    @NameInMap("AutoConfigRoute")
    public Boolean autoConfigRoute;

    @NameInMap("EnableDpd")
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    public Boolean enableNatTraversal;

    @NameInMap("BgpConfig")
    public String bgpConfig;

    public static ModifyVpnConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeRequest self = new ModifyVpnConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

}
