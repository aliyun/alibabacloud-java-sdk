// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateChannelResponseBody extends TeaModel {
    @NameInMap("Nonce")
    public String nonce;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChannelKey")
    public String channelKey;

    @NameInMap("Timestamp")
    public Integer timestamp;

    public static CreateChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelResponseBody self = new CreateChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChannelResponseBody setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public CreateChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChannelResponseBody setChannelKey(String channelKey) {
        this.channelKey = channelKey;
        return this;
    }
    public String getChannelKey() {
        return this.channelKey;
    }

    public CreateChannelResponseBody setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

}
