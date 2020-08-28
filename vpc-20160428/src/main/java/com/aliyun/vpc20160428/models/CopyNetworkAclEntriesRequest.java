// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CopyNetworkAclEntriesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("SourceNetworkAclId")
    @Validation(required = true)
    public String sourceNetworkAclId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CopyNetworkAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyNetworkAclEntriesRequest self = new CopyNetworkAclEntriesRequest();
        return TeaModel.build(map, self);
    }

}
