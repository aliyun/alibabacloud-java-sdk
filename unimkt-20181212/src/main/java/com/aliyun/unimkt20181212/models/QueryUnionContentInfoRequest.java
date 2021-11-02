// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionContentInfoRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ContentId")
    public String contentId;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    public static QueryUnionContentInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionContentInfoRequest self = new QueryUnionContentInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionContentInfoRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryUnionContentInfoRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public QueryUnionContentInfoRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

}
