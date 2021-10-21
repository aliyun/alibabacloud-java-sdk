// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryCommunicationLogsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryCommunicationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommunicationLogsRequest self = new QueryCommunicationLogsRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommunicationLogsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryCommunicationLogsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryCommunicationLogsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryCommunicationLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
