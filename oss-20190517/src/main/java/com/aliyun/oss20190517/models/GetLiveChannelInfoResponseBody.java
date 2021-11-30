// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetLiveChannelInfoResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Status")
    public String status;

    @NameInMap("Target")
    public LiveChannelTarget target;

    public static GetLiveChannelInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelInfoResponseBody self = new GetLiveChannelInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetLiveChannelInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLiveChannelInfoResponseBody setTarget(LiveChannelTarget target) {
        this.target = target;
        return this;
    }
    public LiveChannelTarget getTarget() {
        return this.target;
    }

}
