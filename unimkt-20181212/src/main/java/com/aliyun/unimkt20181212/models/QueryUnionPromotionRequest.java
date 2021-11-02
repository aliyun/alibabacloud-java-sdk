// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionPromotionRequest extends TeaModel {
    @NameInMap("AlipayOpenId")
    public Long alipayOpenId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ProxyChannelId")
    public String proxyChannelId;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("UnionBizType")
    public String unionBizType;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserNick")
    public String userNick;

    public static QueryUnionPromotionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionPromotionRequest self = new QueryUnionPromotionRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnionPromotionRequest setAlipayOpenId(Long alipayOpenId) {
        this.alipayOpenId = alipayOpenId;
        return this;
    }
    public Long getAlipayOpenId() {
        return this.alipayOpenId;
    }

    public QueryUnionPromotionRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryUnionPromotionRequest setProxyChannelId(String proxyChannelId) {
        this.proxyChannelId = proxyChannelId;
        return this;
    }
    public String getProxyChannelId() {
        return this.proxyChannelId;
    }

    public QueryUnionPromotionRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public QueryUnionPromotionRequest setUnionBizType(String unionBizType) {
        this.unionBizType = unionBizType;
        return this;
    }
    public String getUnionBizType() {
        return this.unionBizType;
    }

    public QueryUnionPromotionRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public QueryUnionPromotionRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
