// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("results")
    public java.util.List<AlertResp> results;

    @NameInMap("total")
    public Integer total;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAlertsResponseBody setResults(java.util.List<AlertResp> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AlertResp> getResults() {
        return this.results;
    }

    public ListAlertsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
