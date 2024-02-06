// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListScheduledSQLsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("results")
    public java.util.List<ScheduledSQL> results;

    @NameInMap("total")
    public Integer total;

    public static ListScheduledSQLsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledSQLsResponseBody self = new ListScheduledSQLsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledSQLsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListScheduledSQLsResponseBody setResults(java.util.List<ScheduledSQL> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ScheduledSQL> getResults() {
        return this.results;
    }

    public ListScheduledSQLsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
