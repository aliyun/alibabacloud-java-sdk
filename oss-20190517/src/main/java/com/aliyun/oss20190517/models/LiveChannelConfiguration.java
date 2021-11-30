// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannelConfiguration extends TeaModel {
    // description
    @NameInMap("Description")
    public String description;

    @NameInMap("Snapshot")
    public LiveChannelSnapshot snapshot;

    // description
    @NameInMap("Status")
    public String status;

    @NameInMap("Target")
    public LiveChannelTarget target;

    public static LiveChannelConfiguration build(java.util.Map<String, ?> map) throws Exception {
        LiveChannelConfiguration self = new LiveChannelConfiguration();
        return TeaModel.build(map, self);
    }

    public LiveChannelConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LiveChannelConfiguration setSnapshot(LiveChannelSnapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public LiveChannelSnapshot getSnapshot() {
        return this.snapshot;
    }

    public LiveChannelConfiguration setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LiveChannelConfiguration setTarget(LiveChannelTarget target) {
        this.target = target;
        return this;
    }
    public LiveChannelTarget getTarget() {
        return this.target;
    }

}
