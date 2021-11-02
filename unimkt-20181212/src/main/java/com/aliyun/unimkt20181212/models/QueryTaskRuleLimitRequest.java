// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskRuleLimitRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    public static QueryTaskRuleLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRuleLimitRequest self = new QueryTaskRuleLimitRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskRuleLimitRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
