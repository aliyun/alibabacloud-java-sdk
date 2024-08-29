// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMetricStoresResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("metricstores")
    public java.util.List<String> metricstores;

    @NameInMap("total")
    public Integer total;

    public static ListMetricStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricStoresResponseBody self = new ListMetricStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricStoresResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListMetricStoresResponseBody setMetricstores(java.util.List<String> metricstores) {
        this.metricstores = metricstores;
        return this;
    }
    public java.util.List<String> getMetricstores() {
        return this.metricstores;
    }

    public ListMetricStoresResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
