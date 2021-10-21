// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationsByIntentionRequest extends TeaModel {
    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TmProduceStatus")
    public String tmProduceStatus;

    public static QueryTradeMarkApplicationsByIntentionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationsByIntentionRequest self = new QueryTradeMarkApplicationsByIntentionRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationsByIntentionRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public QueryTradeMarkApplicationsByIntentionRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryTradeMarkApplicationsByIntentionRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTradeMarkApplicationsByIntentionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeMarkApplicationsByIntentionRequest setTmProduceStatus(String tmProduceStatus) {
        this.tmProduceStatus = tmProduceStatus;
        return this;
    }
    public String getTmProduceStatus() {
        return this.tmProduceStatus;
    }

}
