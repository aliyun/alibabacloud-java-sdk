// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionChannelRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    public static QueryUnionChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionChannelRequest self = new QueryUnionChannelRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
