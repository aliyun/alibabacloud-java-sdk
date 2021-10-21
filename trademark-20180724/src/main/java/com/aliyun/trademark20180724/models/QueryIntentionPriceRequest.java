// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionPriceRequest extends TeaModel {
    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("Channel")
    public String channel;

    public static QueryIntentionPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionPriceRequest self = new QueryIntentionPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntentionPriceRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public QueryIntentionPriceRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
