// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayerConfigResponseBody extends TeaModel {
    @NameInMap("PlayerConfig")
    public String playerConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPlayerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlayerConfigResponseBody self = new GetPlayerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlayerConfigResponseBody setPlayerConfig(String playerConfig) {
        this.playerConfig = playerConfig;
        return this;
    }
    public String getPlayerConfig() {
        return this.playerConfig;
    }

    public GetPlayerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
