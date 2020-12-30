// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpPeerResponseBody extends TeaModel {
    @NameInMap("BgpPeerId")
    public String bgpPeerId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBgpPeerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpPeerResponseBody self = new CreateBgpPeerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBgpPeerResponseBody setBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
        return this;
    }
    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    public CreateBgpPeerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
