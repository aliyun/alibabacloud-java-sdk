// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("LocalAsn")
    public Long localAsn;

    @NameInMap("PeerAsn")
    @Validation(required = true)
    public Long peerAsn;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("IsFakeAsn")
    public Boolean isFakeAsn;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpVersion")
    public String ipVersion;

    public static CreateBgpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpGroupRequest self = new CreateBgpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBgpGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBgpGroupRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public CreateBgpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBgpGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBgpGroupRequest setLocalAsn(Long localAsn) {
        this.localAsn = localAsn;
        return this;
    }
    public Long getLocalAsn() {
        return this.localAsn;
    }

    public CreateBgpGroupRequest setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }
    public Long getPeerAsn() {
        return this.peerAsn;
    }

    public CreateBgpGroupRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateBgpGroupRequest setIsFakeAsn(Boolean isFakeAsn) {
        this.isFakeAsn = isFakeAsn;
        return this;
    }
    public Boolean getIsFakeAsn() {
        return this.isFakeAsn;
    }

    public CreateBgpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBgpGroupRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

}
