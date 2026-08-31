// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListJobInstancesResponseBody extends TeaModel {
    /**
     * <p>The number of jobs returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public String count;

    /**
     * <p>The job configuration details.</p>
     */
    @NameInMap("results")
    public java.util.List<JobInstance> results;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListJobInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstancesResponseBody self = new ListJobInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobInstancesResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public ListJobInstancesResponseBody setResults(java.util.List<JobInstance> results) {
        this.results = results;
        return this;
    }
    public java.util.List<JobInstance> getResults() {
        return this.results;
    }

    public ListJobInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
