// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SubscribeSpaceEventRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("PushConfig")
    public String pushConfig;

    public static SubscribeSpaceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeSpaceEventRequest self = new SubscribeSpaceEventRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeSpaceEventRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SubscribeSpaceEventRequest setPushConfig(String pushConfig) {
        this.pushConfig = pushConfig;
        return this;
    }
    public String getPushConfig() {
        return this.pushConfig;
    }

}
