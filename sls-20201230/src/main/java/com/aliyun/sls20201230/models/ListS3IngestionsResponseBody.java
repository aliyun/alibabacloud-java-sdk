// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListS3IngestionsResponseBody extends TeaModel {
    /**
     * <p>The number of tasks returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The details of the task configurations.</p>
     */
    @NameInMap("results")
    public java.util.List<S3Ingestion> results;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListS3IngestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListS3IngestionsResponseBody self = new ListS3IngestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListS3IngestionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListS3IngestionsResponseBody setResults(java.util.List<S3Ingestion> results) {
        this.results = results;
        return this;
    }
    public java.util.List<S3Ingestion> getResults() {
        return this.results;
    }

    public ListS3IngestionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
