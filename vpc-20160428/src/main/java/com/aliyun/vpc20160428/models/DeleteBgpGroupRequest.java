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

}
