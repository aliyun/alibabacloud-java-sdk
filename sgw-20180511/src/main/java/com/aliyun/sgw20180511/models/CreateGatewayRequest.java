// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GatewayClass")
    public String gatewayClass;

    @NameInMap("Location")
    public String location;

    @NameInMap("Name")
    public String name;

    @NameInMap("PostPaid")
    public Boolean postPaid;

    @NameInMap("PublicNetworkBandwidth")
    public Integer publicNetworkBandwidth;

    @NameInMap("ReleaseAfterExpiration")
    public Boolean releaseAfterExpiration;

    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StorageBundleId")
    public String storageBundleId;

    @NameInMap("Type")
    public String type;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRequest self = new CreateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGatewayRequest setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public CreateGatewayRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayRequest setPostPaid(Boolean postPaid) {
        this.postPaid = postPaid;
        return this;
    }
    public Boolean getPostPaid() {
        return this.postPaid;
    }

    public CreateGatewayRequest setPublicNetworkBandwidth(Integer publicNetworkBandwidth) {
        this.publicNetworkBandwidth = publicNetworkBandwidth;
        return this;
    }
    public Integer getPublicNetworkBandwidth() {
        return this.publicNetworkBandwidth;
    }

    public CreateGatewayRequest setReleaseAfterExpiration(Boolean releaseAfterExpiration) {
        this.releaseAfterExpiration = releaseAfterExpiration;
        return this;
    }
    public Boolean getReleaseAfterExpiration() {
        return this.releaseAfterExpiration;
    }

    public CreateGatewayRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public CreateGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGatewayRequest setStorageBundleId(String storageBundleId) {
        this.storageBundleId = storageBundleId;
        return this;
    }
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public CreateGatewayRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
