// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannelSnapshot extends TeaModel {
    // description
    @NameInMap("DestBucket")
    public String destBucket;

    // description
    @NameInMap("Interval")
    public Long interval;

    // description
    @NameInMap("NotifyTopic")
    public String notifyTopic;

    // description
    @NameInMap("RoleName")
    public String roleName;

    public static LiveChannelSnapshot build(java.util.Map<String, ?> map) throws Exception {
        LiveChannelSnapshot self = new LiveChannelSnapshot();
        return TeaModel.build(map, self);
    }

    public LiveChannelSnapshot setDestBucket(String destBucket) {
        this.destBucket = destBucket;
        return this;
    }
    public String getDestBucket() {
        return this.destBucket;
    }

    public LiveChannelSnapshot setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public LiveChannelSnapshot setNotifyTopic(String notifyTopic) {
        this.notifyTopic = notifyTopic;
        return this;
    }
    public String getNotifyTopic() {
        return this.notifyTopic;
    }

    public LiveChannelSnapshot setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
