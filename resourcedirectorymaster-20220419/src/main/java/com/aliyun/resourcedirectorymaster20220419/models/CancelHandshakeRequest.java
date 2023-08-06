// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelHandshakeRequest extends TeaModel {
    /**
     * <p>The ID of the invitation.</p>
     */
    @NameInMap("HandshakeId")
    public String handshakeId;

    public static CancelHandshakeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelHandshakeRequest self = new CancelHandshakeRequest();
        return TeaModel.build(map, self);
    }

    public CancelHandshakeRequest setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
        return this;
    }
    public String getHandshakeId() {
        return this.handshakeId;
    }

}
