// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannel extends TeaModel {
    // description
    @NameInMap("Description")
    public String description;

    // description
    @NameInMap("LastModified")
    public String lastModified;

    // description
    @NameInMap("Name")
    public String name;

    @NameInMap("PlayUrls")
    public LiveChannelPlayUrls playUrls;

    @NameInMap("PublishUrls")
    public LiveChannelPublishUrls publishUrls;

    // description
    @NameInMap("Status")
    public String status;

    public static LiveChannel build(java.util.Map<String, ?> map) throws Exception {
        LiveChannel self = new LiveChannel();
        return TeaModel.build(map, self);
    }

    public LiveChannel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LiveChannel setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public LiveChannel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LiveChannel setPlayUrls(LiveChannelPlayUrls playUrls) {
        this.playUrls = playUrls;
        return this;
    }
    public LiveChannelPlayUrls getPlayUrls() {
        return this.playUrls;
    }

    public LiveChannel setPublishUrls(LiveChannelPublishUrls publishUrls) {
        this.publishUrls = publishUrls;
        return this;
    }
    public LiveChannelPublishUrls getPublishUrls() {
        return this.publishUrls;
    }

    public LiveChannel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
