// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpGroupAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BgpGroupId")
    @Validation(required = true)
    public String bgpGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("LocalAsn")
    public Long localAsn;

    @NameInMap("PeerAsn")
    public Long peerAsn;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("IsFakeAsn")
    public Boolean isFakeAsn;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyBgpGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpGroupAttributeRequest self = new ModifyBgpGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

}
