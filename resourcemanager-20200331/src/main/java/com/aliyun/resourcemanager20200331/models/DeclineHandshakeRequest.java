// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeclineHandshakeRequest extends TeaModel {
    @NameInMap("HandshakeId")
    public String handshakeId;

    public static DeclineHandshakeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeclineHandshakeRequest self = new DeclineHandshakeRequest();
        return TeaModel.build(map, self);
    }

    public DeclineHandshakeRequest setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
        return this;
    }
    public String getHandshakeId() {
        return this.handshakeId;
    }

}
