// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListUnionMediaIndustryRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ProxyUserId")
    public Long proxyUserId;

    public static ListUnionMediaIndustryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnionMediaIndustryRequest self = new ListUnionMediaIndustryRequest();
        return TeaModel.build(map, self);
    }

    public ListUnionMediaIndustryRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ListUnionMediaIndustryRequest setProxyUserId(Long proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

}
