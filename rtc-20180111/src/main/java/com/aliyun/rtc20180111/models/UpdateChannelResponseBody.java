// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateChannelResponseBody extends TeaModel {
    @NameInMap("Nonce")
    public String nonce;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Timestamp")
    public Integer timestamp;

    public static UpdateChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelResponseBody self = new UpdateChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChannelResponseBody setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UpdateChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateChannelResponseBody setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

}
