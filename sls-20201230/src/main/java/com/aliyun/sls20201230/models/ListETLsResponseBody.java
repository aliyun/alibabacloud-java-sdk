// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListETLsResponseBody extends TeaModel {
    /**
     * <p>The number of data transformation jobs that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    @NameInMap("results")
    public java.util.List<ETL> results;

    /**
     * <p>The total number of data transformation jobs in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListETLsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListETLsResponseBody self = new ListETLsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListETLsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListETLsResponseBody setResults(java.util.List<ETL> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ETL> getResults() {
        return this.results;
    }

    public ListETLsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
