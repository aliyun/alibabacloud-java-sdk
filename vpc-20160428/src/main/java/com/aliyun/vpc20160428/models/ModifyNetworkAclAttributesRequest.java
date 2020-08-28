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

}
