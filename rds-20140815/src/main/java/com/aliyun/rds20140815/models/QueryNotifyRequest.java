// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryNotifyRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("To")
    public String to;

    @NameInMap("WithConfirmed")
    public Boolean withConfirmed;

    public static QueryNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotifyRequest self = new QueryNotifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotifyRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryNotifyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryNotifyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryNotifyRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryNotifyRequest setWithConfirmed(Boolean withConfirmed) {
        this.withConfirmed = withConfirmed;
        return this;
    }
    public Boolean getWithConfirmed() {
        return this.withConfirmed;
    }

}
