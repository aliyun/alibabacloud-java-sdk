// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutLiveChannelResponseBody extends TeaModel {
    @NameInMap("PlayUrls")
    public LiveChannelPlayUrls playUrls;

    @NameInMap("PublishUrls")
    public LiveChannelPublishUrls publishUrls;

    public static PutLiveChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutLiveChannelResponseBody self = new PutLiveChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public PutLiveChannelResponseBody setPlayUrls(LiveChannelPlayUrls playUrls) {
        this.playUrls = playUrls;
        return this;
    }
    public LiveChannelPlayUrls getPlayUrls() {
        return this.playUrls;
    }

    public PutLiveChannelResponseBody setPublishUrls(LiveChannelPublishUrls publishUrls) {
        this.publishUrls = publishUrls;
        return this;
    }
    public LiveChannelPublishUrls getPublishUrls() {
        return this.publishUrls;
    }

}
