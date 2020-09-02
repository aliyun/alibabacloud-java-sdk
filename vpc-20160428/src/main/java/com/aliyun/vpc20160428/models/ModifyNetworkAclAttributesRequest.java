// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNetworkAclAttributesRequest extends TeaModel {
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("NetworkAclName")
    public String networkAclName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyNetworkAclAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAclAttributesRequest self = new ModifyNetworkAclAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAclAttributesRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public ModifyNetworkAclAttributesRequest setNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
        return this;
    }
    public String getNetworkAclName() {
        return this.networkAclName;
    }

    public ModifyNetworkAclAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNetworkAclAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNetworkAclAttributesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
