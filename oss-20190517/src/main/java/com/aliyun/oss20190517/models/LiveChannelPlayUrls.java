// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannelPlayUrls extends TeaModel {
    // description
    @NameInMap("Url")
    public String url;

    public static LiveChannelPlayUrls build(java.util.Map<String, ?> map) throws Exception {
        LiveChannelPlayUrls self = new LiveChannelPlayUrls();
        return TeaModel.build(map, self);
    }

    public LiveChannelPlayUrls setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
