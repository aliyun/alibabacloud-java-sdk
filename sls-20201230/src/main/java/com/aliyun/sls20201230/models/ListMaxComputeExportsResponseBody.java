// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaxComputeExportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Integer count;

    @NameInMap("results")
    public java.util.List<MaxComputeExport> results;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListMaxComputeExportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaxComputeExportsResponseBody self = new ListMaxComputeExportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaxComputeExportsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListMaxComputeExportsResponseBody setResults(java.util.List<MaxComputeExport> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MaxComputeExport> getResults() {
        return this.results;
    }

    public ListMaxComputeExportsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
