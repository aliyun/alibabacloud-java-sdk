// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GeneratePlaybackTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PlaybackToken")
    public String playbackToken;

    public static GeneratePlaybackTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneratePlaybackTokenResponseBody self = new GeneratePlaybackTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneratePlaybackTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneratePlaybackTokenResponseBody setPlaybackToken(String playbackToken) {
        this.playbackToken = playbackToken;
        return this;
    }
    public String getPlaybackToken() {
        return this.playbackToken;
    }

}
