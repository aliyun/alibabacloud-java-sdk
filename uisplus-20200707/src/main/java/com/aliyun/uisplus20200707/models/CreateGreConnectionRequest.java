// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateGreConnectionRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Cidrs")
    @Validation(required = true)
    public String cidrs;

    @NameInMap("LocalIp")
    @Validation(required = true)
    public String localIp;

    @NameInMap("LocalTunnelIp")
    @Validation(required = true)
    public String localTunnelIp;

    @NameInMap("CustomerIp")
    @Validation(required = true)
    public String customerIp;

    @NameInMap("CustomerTunnelIp")
    @Validation(required = true)
    public String customerTunnelIp;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGreConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGreConnectionRequest self = new CreateGreConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateGreConnectionRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public CreateGreConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGreConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGreConnectionRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public CreateGreConnectionRequest setLocalIp(String localIp) {
        this.localIp = localIp;
        return this;
    }
    public String getLocalIp() {
        return this.localIp;
    }

    public CreateGreConnectionRequest setLocalTunnelIp(String localTunnelIp) {
        this.localTunnelIp = localTunnelIp;
        return this;
    }
    public String getLocalTunnelIp() {
        return this.localTunnelIp;
    }

    public CreateGreConnectionRequest setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
        return this;
    }
    public String getCustomerIp() {
        return this.customerIp;
    }

    public CreateGreConnectionRequest setCustomerTunnelIp(String customerTunnelIp) {
        this.customerTunnelIp = customerTunnelIp;
        return this;
    }
    public String getCustomerTunnelIp() {
        return this.customerTunnelIp;
    }

    public CreateGreConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGreConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
