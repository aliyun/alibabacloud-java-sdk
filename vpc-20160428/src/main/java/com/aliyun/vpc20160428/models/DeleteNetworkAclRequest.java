// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclRequest extends TeaModel {
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclRequest self = new DeleteNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DeleteNetworkAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNetworkAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
