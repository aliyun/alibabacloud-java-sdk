// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListGCSIngestionsResponseBody extends TeaModel {
    /**
     * <p>The number of jobs returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The details of the job configurations.</p>
     */
    @NameInMap("results")
    public java.util.List<GCSIngestion> results;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListGCSIngestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGCSIngestionsResponseBody self = new ListGCSIngestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGCSIngestionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListGCSIngestionsResponseBody setResults(java.util.List<GCSIngestion> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GCSIngestion> getResults() {
        return this.results;
    }

    public ListGCSIngestionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
