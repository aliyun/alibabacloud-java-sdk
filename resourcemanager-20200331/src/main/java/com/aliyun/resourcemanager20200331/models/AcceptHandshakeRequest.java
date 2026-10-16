// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AcceptHandshakeRequest extends TeaModel {
    /**
     * <p>The handshake ID.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/160006.html">ListHandshakesForAccount</a> to obtain the handshake ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h-Ih8IuPfvV0t0****</p>
     */
    @NameInMap("HandshakeId")
    public String handshakeId;

    public static AcceptHandshakeRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptHandshakeRequest self = new AcceptHandshakeRequest();
        return TeaModel.build(map, self);
    }

    public AcceptHandshakeRequest setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
        return this;
    }
    public String getHandshakeId() {
        return this.handshakeId;
    }

}
