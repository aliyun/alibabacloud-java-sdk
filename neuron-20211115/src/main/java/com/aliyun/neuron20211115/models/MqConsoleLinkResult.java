// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqConsoleLinkResult extends TeaModel {
    @NameInMap("groupLinkUrl")
    public String groupLinkUrl;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("topicLinkUrl")
    public String topicLinkUrl;

    public static MqConsoleLinkResult build(java.util.Map<String, ?> map) throws Exception {
        MqConsoleLinkResult self = new MqConsoleLinkResult();
        return TeaModel.build(map, self);
    }

    public MqConsoleLinkResult setGroupLinkUrl(String groupLinkUrl) {
        this.groupLinkUrl = groupLinkUrl;
        return this;
    }
    public String getGroupLinkUrl() {
        return this.groupLinkUrl;
    }

    public MqConsoleLinkResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MqConsoleLinkResult setTopicLinkUrl(String topicLinkUrl) {
        this.topicLinkUrl = topicLinkUrl;
        return this;
    }
    public String getTopicLinkUrl() {
        return this.topicLinkUrl;
    }

}
