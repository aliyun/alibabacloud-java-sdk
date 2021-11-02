// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryPromotionRequest extends TeaModel {
    @NameInMap("AlipayOpenId")
    public String alipayOpenId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("ProxyChannelId")
    public String proxyChannelId;

    @NameInMap("UserId")
    public String userId;

    public static QueryPromotionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPromotionRequest self = new QueryPromotionRequest();
        return TeaModel.build(map, self);
    }

    public QueryPromotionRequest setAlipayOpenId(String alipayOpenId) {
        this.alipayOpenId = alipayOpenId;
        return this;
    }
    public String getAlipayOpenId() {
        return this.alipayOpenId;
    }

    public QueryPromotionRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryPromotionRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryPromotionRequest setProxyChannelId(String proxyChannelId) {
        this.proxyChannelId = proxyChannelId;
        return this;
    }
    public String getProxyChannelId() {
        return this.proxyChannelId;
    }

    public QueryPromotionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
