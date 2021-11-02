// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskBizTypeRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    public static QueryTaskBizTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskBizTypeRequest self = new QueryTaskBizTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskBizTypeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
