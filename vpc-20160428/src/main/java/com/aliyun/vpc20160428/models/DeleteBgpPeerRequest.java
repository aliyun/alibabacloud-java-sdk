// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpPeerRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BgpPeerId")
    @Validation(required = true)
    public String bgpPeerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteBgpPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpPeerRequest self = new DeleteBgpPeerRequest();
        return TeaModel.build(map, self);
    }

}
