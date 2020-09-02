// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewayAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyIpv6GatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewayAttributeRequest self = new ModifyIpv6GatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6GatewayAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIpv6GatewayAttributeRequest setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public ModifyIpv6GatewayAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyIpv6GatewayAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
