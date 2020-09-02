// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BgpGroupId")
    @Validation(required = true)
    public String bgpGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteBgpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpGroupRequest self = new DeleteBgpGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBgpGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteBgpGroupRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public DeleteBgpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
