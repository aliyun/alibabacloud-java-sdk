// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeIntentionUserListRequest extends TeaModel {
    @NameInMap("Begin")
    public Long begin;

    @NameInMap("End")
    public Long end;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Status")
    public Integer status;

    public static QueryTradeIntentionUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeIntentionUserListRequest self = new QueryTradeIntentionUserListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeIntentionUserListRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public QueryTradeIntentionUserListRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryTradeIntentionUserListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeIntentionUserListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTradeIntentionUserListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTradeIntentionUserListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
