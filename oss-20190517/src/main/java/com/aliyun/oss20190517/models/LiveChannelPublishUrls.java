// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannelPublishUrls extends TeaModel {
    // description
    @NameInMap("Url")
    public String url;

    public static LiveChannelPublishUrls build(java.util.Map<String, ?> map) throws Exception {
        LiveChannelPublishUrls self = new LiveChannelPublishUrls();
        return TeaModel.build(map, self);
    }

    public LiveChannelPublishUrls setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
