// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class ModifyGreConnectionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("GreConnectionId")
    @Validation(required = true)
    public String greConnectionId;

    @NameInMap("Cidrs")
    public String cidrs;

    @NameInMap("Name")
    public String name;

    @NameInMap("LocalIp")
    public String localIp;

    @NameInMap("CustomerIp")
    public String customerIp;

    @NameInMap("LocalTunnelIp")
    public String localTunnelIp;

    @NameInMap("CustomerTunnelIp")
    public String customerTunnelIp;

    @NameInMap("Description")
    public String description;

    public static ModifyGreConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGreConnectionRequest self = new ModifyGreConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGreConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyGreConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyGreConnectionRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public ModifyGreConnectionRequest setGreConnectionId(String greConnectionId) {
        this.greConnectionId = greConnectionId;
        return this;
    }
    public String getGreConnectionId() {
        return this.greConnectionId;
    }

    public ModifyGreConnectionRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public ModifyGreConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyGreConnectionRequest setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }
    public String getLocalIp() {
        return this.localIp;
    }

    public ModifyGreConnectionRequest setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }
    public String getCustomerIp() {
        return this.customerIp;
    }

    public ModifyGreConnectionRequest setLocalTunnelIp(String localTunnelIp) {
        this.localTunnelIp = localTunnelIp;
        return this;
    }
    public String getLocalTunnelIp() {
        return this.localTunnelIp;
    }

    public ModifyGreConnectionRequest setCustomerTunnelIp(String customerTunnelIp) {
        this.customerTunnelIp = customerTunnelIp;
        return this;
    }
    public String getCustomerTunnelIp() {
        return this.customerTunnelIp;
    }

    public ModifyGreConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
