// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpPeerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BgpPeerId")
    @Validation(required = true)
    public String bgpPeerId;

    public static CreateBgpPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpPeerResponse self = new CreateBgpPeerResponse();
        return TeaModel.build(map, self);
    }

}
