// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryAvailableBalanceRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    public static QueryAvailableBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableBalanceRequest self = new QueryAvailableBalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvailableBalanceRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryAvailableBalanceRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

}
