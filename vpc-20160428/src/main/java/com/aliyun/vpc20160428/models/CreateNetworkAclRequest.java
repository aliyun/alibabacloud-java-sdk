// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNetworkAclRequest extends TeaModel {
    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("NetworkAclName")
    public String networkAclName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclRequest self = new CreateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

}
