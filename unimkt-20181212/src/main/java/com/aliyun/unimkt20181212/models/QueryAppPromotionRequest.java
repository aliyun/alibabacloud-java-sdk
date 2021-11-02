// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryAppPromotionRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserType")
    public String userType;

    public static QueryAppPromotionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPromotionRequest self = new QueryAppPromotionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppPromotionRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryAppPromotionRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryAppPromotionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAppPromotionRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
