// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutLiveChannelRequest extends TeaModel {
    @NameInMap("LiveChannelConfiguration")
    public LiveChannelConfiguration liveChannelConfiguration;

    public static PutLiveChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLiveChannelRequest self = new PutLiveChannelRequest();
        return TeaModel.build(map, self);
    }

    public PutLiveChannelRequest setLiveChannelConfiguration(LiveChannelConfiguration liveChannelConfiguration) {
        this.liveChannelConfiguration = liveChannelConfiguration;
        return this;
    }
    public LiveChannelConfiguration getLiveChannelConfiguration() {
        return this.liveChannelConfiguration;
    }

}
